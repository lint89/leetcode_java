/**
 * Author : Lin Tao
 * Date   : 2020/2/9
 */

/**********************************************************************************
 * com.lintlint.leetcode.easy.i0067_add_binary
 *
 * 67. 二进制求和
 *
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。
 *
 * 输入为非空字符串且只包含数字 1 和 0。
 *
 * 示例 1:
 *
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * 示例 2:
 *
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-binary
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 **********************************************************************************/

package com.lintlint.leetcode.easy.solved.i0067_add_binary;

public class AddBinary {
    public String addBinary(String a, String b) {
        int carry = 0;
        int aIndex = a.length() - 1;
        int bIndex = b.length() - 1;

        StringBuffer sum = new StringBuffer();
        while (aIndex >= 0 || bIndex >= 0) {
            if (aIndex < 0) {
                sum.append(addCarry(b.substring(0, bIndex + 1), carry));
                break;
            }

            if (bIndex < 0) {
                sum.append(addCarry(a.substring(0, aIndex + 1), carry));
                break;
            }

            int tempSum = Integer.valueOf(a.charAt(aIndex) - '0') + Integer.valueOf(b.charAt(bIndex) - '0') + carry;
            if (tempSum == 0) {
                sum.append('0');
                carry = 0;
            } else if (tempSum == 1) {
                sum.append('1');
                carry = 0;
            } else if (tempSum == 2){
                sum.append('0');
                carry = 1;
            } else {
                sum.append('1');
                carry = 1;
            }

            aIndex--;
            bIndex--;
        }

        if (carry != 0 && aIndex == 0 && bIndex == 0) {
            sum.append('1');
        }

        return sum.reverse().toString();
    }

    private String addCarry(String num, int carry) {
        StringBuffer sb = new StringBuffer();
        for (int i = num.length() - 1; i >= 0; i--) {
            int sum = Integer.valueOf(num.charAt(i) - '0') + carry;
            if (sum == 0) {
                sb.append('0');
                carry = 0;
            } else if (sum == 1) {
                sb.append('1');
                carry = 0;
            } else {
                sb.append('0');
                carry = 1;
            }
        }

        if (carry != 0) {
            sb.append('1');
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        AddBinary obj = new AddBinary();
        String resul = obj.addBinary("1111", "11");
    }


}
