/**
 * Author : Lin Tao
 * Date   : 2020/3/22
 */

/**********************************************************************************
 * com.lintlint.leetcode.medium.i0945_minimum_increment_to_make_array_unique
 *
 * 945. 使数组唯一的最小增量
 * 给定整数数组 A，每次 move 操作将会选择任意 A[i]，并将其递增 1。
 *
 * 返回使 A 中的每个值都是唯一的最少操作次数。
 *
 * 示例 1:
 *
 * 输入：[1,2,2]
 * 输出：1
 * 解释：经过一次 move 操作，数组将变为 [1, 2, 3]。
 * 示例 2:
 *
 * 输入：[3,2,1,2,1,7]
 * 输出：6
 * 解释：经过 6 次 move 操作，数组将变为 [3, 4, 1, 2, 5, 7]。
 * 可以看出 5 次或 5 次以下的 move 操作是不能让数组的每个值唯一的。
 * 提示：
 *
 * 0 <= A.length <= 40000
 * 0 <= A[i] < 40000
 **********************************************************************************/

package com.lintlint.leetcode.medium.solved.i0945_minimum_increment_to_make_array_unique;

public class MinimumIncrementToMakeArrayUnique {
    public int minIncrementForUnique(int[] A) {
        int[] num = new int[80000];
        for (int i : A) {
            num[i]++;
        }

        int step = 0;
        for (int i = 0; i < 80000; i++) {
            if (num[i] == 0 || num[i] == 1) {
                continue;
            } else {
                num[i+1] += num[i] - 1;
                step += num[i] - 1;
            }
        }

        return step;
    }

    public static void main(String[] args) {
        int[] A = {2, 2, 2, 1};
        MinimumIncrementToMakeArrayUnique obj = new MinimumIncrementToMakeArrayUnique();
        obj.minIncrementForUnique(A);

    }
}
