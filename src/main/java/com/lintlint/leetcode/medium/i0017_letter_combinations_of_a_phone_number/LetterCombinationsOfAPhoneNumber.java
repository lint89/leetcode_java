/**
 * Author : Lin Tao
 * Date   : 2020/4/6
 */

/**********************************************************************************
 * com.lintlint.leetcode.medium.i0017_letter_combinations_of_a_phone_number
 *
 * 17. 电话号码的字母组合
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 *
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 *
 * 示例:
 *
 * 输入："23"
 * 输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * 说明:
 * 尽管上面的答案是按字典序排列的，但是你可以任意选择答案输出的顺序。
 **********************************************************************************/

package com.lintlint.leetcode.medium.i0017_letter_combinations_of_a_phone_number;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {
    public List<String> letterCombinations(String digits) {
        HashMap<Character, String> map = new HashMap<Character, String>() {{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};

        List<String> ans = new ArrayList<>();
        for (int i = 0; i < digits.length(); i++) {
            ans = addChar(ans, map.get(digits.charAt(i)));
        }
        return ans;
    }

    private List<String> addChar(List<String> wordList, String s) {
        List<String> ans = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (wordList.size() == 0) {
                ans.add("" + c);
            } else {
                for (String word : wordList) {
                    ans.add(word + c);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        LetterCombinationsOfAPhoneNumber obj = new LetterCombinationsOfAPhoneNumber();
        obj.letterCombinations("23");
    }
}
