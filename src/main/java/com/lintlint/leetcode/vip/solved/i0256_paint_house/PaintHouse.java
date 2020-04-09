/**
 * Author : Lin Tao
 * Date   : 2020/3/4
 */

/**********************************************************************************
 * com.lintlint.leetcode.vip.i0256_paint_house
 *
 * 256. 粉刷房子
 * 假如有一排房子，共 n 个，每个房子可以被粉刷成红色、蓝色或者绿色这三种颜色中的一种，你需要粉刷所有的房子并且使其相邻的两个房子颜色不能相同。
 *
 * 当然，因为市场上不同颜色油漆的价格不同，所以房子粉刷成不同颜色的花费成本也是不同的。每个房子粉刷成不同颜色的花费是以一个 n x 3 的矩阵来表示的。
 *
 * 例如，costs[0][0] 表示第 0 号房子粉刷成红色的成本花费；costs[1][2] 表示第 1 号房子粉刷成绿色的花费，以此类推。请你计算出粉刷完所有房子最少的花费成本。
 *
 * 注意：
 *
 * 所有花费均为正整数。
 *
 * 示例：
 *
 * 输入: [[17,2,17],[16,16,5],[14,3,19]]
 * 输出: 10
 * 解释: 将 0 号房子粉刷成蓝色，1 号房子粉刷成绿色，2 号房子粉刷成蓝色。
 *      最少花费: 2 + 5 + 3 = 10。
 **********************************************************************************/

package com.lintlint.leetcode.vip.solved.i0256_paint_house;

public class PaintHouse {
    public int minCost(int[][] costs) {
        int len = costs.length;
        if (len == 0) {
            return 0;
        }

        int[][] sum = new int[costs.length][3];
        sum[0][0] = costs[0][0];
        sum[0][1] = costs[0][1];
        sum[0][2] = costs[0][2];
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = costs[i][j] + Math.min(sum[i-1][(j+1)%3], sum[i-1][(j+2)%3]);
            }
        }
        return Math.min(sum[len- 1][0], Math.min(sum[len-1][1], sum[len-1][2]));

    }
}
