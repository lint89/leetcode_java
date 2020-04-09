/**
 * Author : Lin Tao
 * Date   : 2020/3/4
 */

/**********************************************************************************
 * com.lintlint.leetcode.vip.i0276_paint_fence
 *
 * 276. 栅栏涂色
 * 有 k 种颜色的涂料和一个包含 n 个栅栏柱的栅栏，每个栅栏柱可以用其中一种颜色进行上色。
 *
 * 你需要给所有栅栏柱上色，并且保证其中相邻的栅栏柱 最多连续两个 颜色相同。然后，返回所有有效涂色的方案数。
 *
 * 注意:
 * n 和 k 均为非负的整数。
 *
 * 示例:
 *
 * 输入: n = 3，k = 2
 * 输出: 6
 * 解析: 用 c1 表示颜色 1，c2 表示颜色 2，所有可能的涂色方案有:
 *
 *             柱 1    柱 2   柱 3
 *  -----      -----  -----  -----
 *    1         c1     c1     c2
 *    2         c1     c2     c1
 *    3         c1     c2     c2
 *    4         c2     c1     c1
 *    5         c2     c1     c2
 *    6         c2     c2     c1
 **********************************************************************************/

package com.lintlint.leetcode.vip.solved.i0276_paint_fence;

public class PaintFence {
    public int numWays(int n, int k) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return k;
        }

        int[] num = new int[n + 1];
        num[1] = k;
        num[2] = num[1] * k;
        for (int i = 3; i <= n; i++) {
            num[i] = num[i - 1] * (k - 1) + num[i - 2] * (k - 1);
            if (num[i] <= 0) {
                return 0;
            }
        }

        return num[n];
    }

    public static void main(String[] args) {
        PaintFence obj = new PaintFence();
        obj.numWays(3, 2);
    }
}
