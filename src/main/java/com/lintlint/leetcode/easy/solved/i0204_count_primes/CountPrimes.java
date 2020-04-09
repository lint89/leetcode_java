/**
 * Author : Lin Tao
 * Date   : 2020/2/12
 */

/**********************************************************************************
 * com.lintlint.leetcode.easy.i0204_count_primes
 *
 * 204. 计数质数
 *
 * 统计所有小于非负整数 n 的质数的数量。
 *
 * 示例:
 *
 * 输入: 10
 * 输出: 4
 * 解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
 **********************************************************************************/

package com.lintlint.leetcode.easy.solved.i0204_count_primes;

public class CountPrimes {
    public int countPrimes(int n) {
        int count = 0;

        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }

        return count;

    }

    private boolean isPrime(int n) {
        int num = (int) Math.sqrt(n);
        for (int i = 2; i < num; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        CountPrimes obj = new CountPrimes();
        obj.countPrimes(10);
    }

}
