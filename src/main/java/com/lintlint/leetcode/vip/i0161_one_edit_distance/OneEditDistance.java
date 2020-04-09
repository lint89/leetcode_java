/**
 * Author : Lin Tao
 * Date   : 2020/1/25
 */

/**********************************************************************************
 * com.lintlint.leetcode.vip.i0161_one_edit_distance
 *
 * 161. 相隔为 1 的编辑距离
 *
 * 给定两个字符串 s 和 t，判断他们的编辑距离是否为 1。
 *
 * 注意：
 *
 * 满足编辑距离等于 1 有三种可能的情形：
 *
 * 往 s 中插入一个字符得到 t
 * 从 s 中删除一个字符得到 t
 * 在 s 中替换一个字符得到 t
 * 示例 1：
 *
 * 输入: s = "ab", t = "acb"
 * 输出: true
 * 解释: 可以将 'c' 插入字符串 s 来得到 t。
 * 示例 2:
 *
 * 输入: s = "cab", t = "ad"
 * 输出: false
 * 解释: 无法通过 1 步操作使 s 变为 t。
 * 示例 3:
 *
 * 输入: s = "1203", t = "1213"
 * 输出: true
 * 解释: 可以将字符串 s 中的 '0' 替换为 '1' 来得到 t。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/one-edit-distance
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **********************************************************************************/

package com.lintlint.leetcode.vip.i0161_one_edit_distance;

public class OneEditDistance {
    public boolean isOneEditDistance(String s, String t) {
        int diffNum = 0;

        int diff = Math.abs(s.length() - t.length());

        if (s.isEmpty() && t.isEmpty()) {
            return false;
        }

        if (s.equals(t)) {
            return false;
        }

        if (diff == 0) {
            for (int i = 0; i < s.length(); i++) {
               if (s.charAt(i) != t.charAt(i)) {
                   diffNum++;
               }

               if (diffNum == 2) {
                   return false;
               }
            }

            return true;
        }

        if (diff == 1) {
            int find = 0;
            if (s.length() > t.length()) {
                for (int i = 0; i < t.length();) {
                    if (find == 0) {
                        if (s.charAt(i) != t.charAt(i)) {
                            find = 1;
                            continue;
                        }
                    } else {
                        if (s.charAt(i + 1) != t.charAt(i)) {
                            return false;
                        }
                    }
                    i++;
                }
                return true;
            } else {
                for (int i = 0; i < s.length();) {
                    if (find == 0) {
                        if (s.charAt(i) != t.charAt(i)) {
                            find = 1;
                            continue;
                        }
                    } else {
                        if (s.charAt(i) != t.charAt(i + 1)) {
                            return false;
                        }
                    }
                    i++;
                }
                return true;
            }
        }

        return false;
    }
}
