/**
 * Author : Lin Tao
 * Date   : 2020/3/22
 */

/**********************************************************************************
 * com.lintlint.leetcode.medium.i0006_zigzag_conversion
 *
 * 6. Z 字形变换
 * 将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。
 *
 * 比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：
 *
 * L   C   I   R
 * E T O E S I I G
 * E   D   H   N
 * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："LCIRETOESIIGEDHN"。
 *
 * 请你实现这个将字符串进行指定行数变换的函数：
 *
 * string convert(string s, int numRows);
 * 示例 1:
 *
 * 输入: s = "LEETCODEISHIRING", numRows = 3
 * 输出: "LCIRETOESIIGEDHN"
 * 示例 2:
 *
 * 输入: s = "LEETCODEISHIRING", numRows = 4
 * 输出: "LDREOEIIECIHNTSG"
 * 解释:
 *
 * L     D     R
 * E   O E   I I
 * E C   I H   N
 * T     S     G
 **********************************************************************************/

package com.lintlint.leetcode.medium.solved.i0006_zigzag_conversion;

import java.util.ArrayList;
import java.util.HashMap;

public class ZigzagConversion {
    public String convert(String s, int numRows) {
        if (numRows <= 1) {
            return s;
        }
        HashMap<Integer, ArrayList<Character>> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            int index = i % ((numRows - 1) * 2);
            if (index > (numRows - 1)) {
                index = (numRows - 1) * 2 - index;
            }

            map.putIfAbsent(index, new ArrayList<>());
            map.get(index).add(s.charAt(i));
        }

        StringBuffer sb = new StringBuffer();
        for (int i : map.keySet()) {
            for (Character c : map.get(i)) {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
