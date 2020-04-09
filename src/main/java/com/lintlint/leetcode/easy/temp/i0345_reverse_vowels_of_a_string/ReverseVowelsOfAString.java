/**
 * Author : Lin Tao
 * Date   : 2020/2/26
 */

/**********************************************************************************
 * com.lintlint.leetcode.easy.i0345_reverse_vowels_of_a_string
 *
 * 345. 反转字符串中的元音字母
 *
 * 编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
 *
 * 示例 1:
 *
 * 输入: "hello"
 * 输出: "holle"
 * 示例 2:
 *
 * 输入: "leetcode"
 * 输出: "leotcede"
 * 说明:
 * 元音字母不包含字母"y"。
 **********************************************************************************/

package com.lintlint.leetcode.easy.temp.i0345_reverse_vowels_of_a_string;

import java.util.Arrays;
import java.util.HashSet;

public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        HashSet<Character> set = new HashSet<>(Arrays.asList(
                'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        char[] sArray = s.toCharArray();

        for (int i = 0, j = sArray.length - 1;  i < j; ) {

            boolean left = set.contains(sArray[i]);
            boolean right = set.contains(sArray[j]);

            if (left && right) {
                char temp = sArray[j];
                sArray[j] = sArray[i];
                sArray[i] = temp;
                i++;
                j--;
            } else if (left && !right) {
                j--;
            } else if (!left && right) {
                i++;
            } else {
                j++;
                j--;
            }
        }

        return new String(sArray);
    }
}
