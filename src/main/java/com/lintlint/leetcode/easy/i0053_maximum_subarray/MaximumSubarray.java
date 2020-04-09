/**
 * Author : Lin Tao
 * Date   : 2020/3/4
 */

/**********************************************************************************
 * com.lintlint.leetcode.easy.i0053_maximum_subarray
 *
 * 53. 最大子序和
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * 示例:
 *
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * 进阶:
 *
 * 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。
 **********************************************************************************/

package com.lintlint.leetcode.easy.i0053_maximum_subarray;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int currSum = nums[0], maxSum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }
}
