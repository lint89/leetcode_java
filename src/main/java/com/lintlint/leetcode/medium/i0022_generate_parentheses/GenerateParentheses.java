/**
 * Author : Lin Tao
 * Date   : 2020/4/6
 */

/**********************************************************************************
 * com.lintlint.leetcode.medium.i0022_generate_parentheses
 *
 * 22. 括号生成
 * 给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
 *
 * 例如，给出 n = 3，生成结果为：
 *
 * [
 *   "((()))",
 *   "(()())",
 *   "(())()",
 *   "()(())",
 *   "()()()"
 * ]
 **********************************************************************************/

package com.lintlint.leetcode.medium.i0022_generate_parentheses;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans = new ArrayList<>();
        backTrace(ans, "", 0, 0, n);
        return ans;
    }

    private void backTrace(List<String> ans, String cur, int open, int close, int max) {
        if (cur.length() ==  2 * max) {
            ans.add(cur);
            return;
        }

        if (open < max) {
            backTrace(ans, cur + '(', open + 1, close, max);
        }

        if (close < open) {
            backTrace(ans, cur + ')', open, close + 1, max);
        }

    }
}
