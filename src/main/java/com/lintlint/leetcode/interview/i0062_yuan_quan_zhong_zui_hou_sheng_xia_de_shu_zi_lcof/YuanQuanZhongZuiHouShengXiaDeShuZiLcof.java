/**
 * Author : Lin Tao
 * Date   : 2020/3/30
 */

/**********************************************************************************
 * com.lintlint.leetcode.interview.i0062_yuan_quan_zhong_zui_hou_sheng_xia_de_shu_zi_lcof
 *
 * 面试题62. 圆圈中最后剩下的数字
 * 0,1,,n-1这n个数字排成一个圆圈，从数字0开始，每次从这个圆圈里删除第m个数字。求出这个圆圈里剩下的最后一个数字。
 *
 * 例如，0、1、2、3、4这5个数字组成一个圆圈，从数字0开始每次删除第3个数字，则删除的前4个数字依次是2、0、4、1，因此最后剩下的数字是3。
 *
 *
 *
 * 示例 1：
 *
 * 输入: n = 5, m = 3
 * 输出: 3
 * 示例 2：
 *
 * 输入: n = 10, m = 17
 * 输出: 2
 *
 *
 * 限制：
 *
 * 1 <= n <= 10^5
 * 1 <= m <= 10^6
 **********************************************************************************/

package com.lintlint.leetcode.interview.i0062_yuan_quan_zhong_zui_hou_sheng_xia_de_shu_zi_lcof;

public class YuanQuanZhongZuiHouShengXiaDeShuZiLcof {
    public int lastRemaining(int n, int m) {
        return f(n, m);
    }

    private int f(int n, int m) {
        if (n == 1) {
            return 0;
        }
        int x = f(n - 1, m);
        return (m + x) % n;
    }

    public static void main(String[] args) {
        YuanQuanZhongZuiHouShengXiaDeShuZiLcof obj = new YuanQuanZhongZuiHouShengXiaDeShuZiLcof();
        obj.lastRemaining(5, 3);
    }
}
