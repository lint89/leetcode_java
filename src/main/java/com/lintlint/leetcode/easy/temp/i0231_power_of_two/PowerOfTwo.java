/**
 * Author : Lin Tao
 * Date   : 2020/2/12
 */

/**********************************************************************************
 * com.lintlint.leetcode.easy.i0231_power_of_two
 *
 * 231. 2的幂
 *
 * 给定一个整数，编写一个函数来判断它是否是 2 的幂次方。
 *
 * 示例 1:
 *
 * 输入: 1
 * 输出: true
 * 解释: 20 = 1
 * 示例 2:
 *
 * 输入: 16
 * 输出: true
 * 解释: 24 = 16
 * 示例 3:
 *
 * 输入: 218
 * 输出: false
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/power-of-two
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **********************************************************************************/

package com.lintlint.leetcode.easy.temp.i0231_power_of_two;

public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            if (count > 1) {
                return false;
            }
            n >>= 1;
        }

        return true;

    }
}
