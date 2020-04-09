/**
 * Author : Lin Tao
 * Date   : 2020/2/28
 */

/**********************************************************************************
 * com.lintlint.leetcode.easy.i0268_missing_number
 *
 * 268. 缺失数字
 * 给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
 *
 * 示例 1:
 *
 * 输入: [3,0,1]
 * 输出: 2
 * 示例 2:
 *
 * 输入: [9,6,4,2,3,5,7,0,1]
 * 输出: 8
 * 说明:
 * 你的算法应具有线性时间复杂度。你能否仅使用额外常数空间来实现?
 **********************************************************************************/

package com.lintlint.leetcode.easy.temp.i0268_missing_number;

import java.util.HashSet;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        for (int i = 0; i < nums.length + 1; i++) {
            if (set.contains(i)) {
                continue;
            } else {
                return i;
            }
        }

        return 0;
    }
}
