/**
 * Author : Lin Tao
 * Date   : 2020/2/26
 */

/**********************************************************************************
 * com.lintlint.leetcode.easy.i0944_squares_of_a_sorted_array
 *
 * 977. 有序数组的平方
 *
 给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。



 示例 1：

 输入：[-4,-1,0,3,10]
 输出：[0,1,9,16,100]
 示例 2：

 输入：[-7,-3,2,3,11]
 输出：[4,9,9,49,121]


 提示：

 1 <= A.length <= 10000
 -10000 <= A[i] <= 10000
 A 已按非递减顺序排序。
 *
 *
 **********************************************************************************/

package com.lintlint.leetcode.easy.temp.i0944_squares_of_a_sorted_array;

public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] A) {
        int i = 0;
        for (; i < A.length; i++) {
            if (A[i] >= 0) {
                break;
            }
        }

        int[] result = new int[A.length];

        int j = i - 1;
        for (int k = 0; k < A.length; k++) {
            if (j >= 0 && i < A.length) {
                if (A[i] + A[j] > 0) {
                    result[k] = (int) Math.pow(A[j], 2);
                    j--;
                } else {
                    result[k] = (int) Math.pow(A[i], 2);
                    i++;
                }
            } else if (j >= 0) {
                result[k] = (int) Math.pow(A[j], 2);
                j--;
            } else {
                result[k] = (int) Math.pow(A[i], 2);
                i++;
            }
        }

        return result;

    }
}
