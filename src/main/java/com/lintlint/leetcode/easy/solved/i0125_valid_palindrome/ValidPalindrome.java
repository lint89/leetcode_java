/**
 * Author : Lin Tao
 * Date   : 2020/2/9
 */

/**********************************************************************************
 * com.lintlint.leetcode.easy.i0125_valid_palindrome
 *
 * 125. 验证回文串
 *
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 *
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 *
 * 示例 1:
 *
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 示例 2:
 *
 * 输入: "race a car"
 * 输出: false
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-palindrome
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **********************************************************************************/

package com.lintlint.leetcode.easy.solved.i0125_valid_palindrome;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length();

        s = s.toLowerCase();
        while (i <= j) {
            if (! Character.isDigit(s.charAt(i)) && ! Character.isLetter(s.charAt(i))) {
                i++;
                continue;
            }

            if (! Character.isDigit(s.charAt(j)) && ! Character.isLetter(s.charAt(j))) {
                j--;
                continue;
            }

            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
                continue;
            } else {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        ValidPalindrome obj = new ValidPalindrome();
        obj.isPalindrome("A man, a plan, a canal: Panama");
    }
}
