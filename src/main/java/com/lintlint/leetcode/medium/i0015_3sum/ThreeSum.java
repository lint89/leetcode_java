/**
 * Author : Lin Tao
 * Date   : 2020/4/6
 */

/**********************************************************************************
 * com.lintlint.leetcode.medium.i0015_3sum
 *
 * 15. 三数之和
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
 *
 * 注意：答案中不可以包含重复的三元组。
 *
 *
 *
 * 示例：
 *
 * 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 *
 * 满足要求的三元组集合为：
 * [
 *   [-1, 0, 1],
 *   [-1, -1, 2]
 * ]
 **********************************************************************************/

package com.lintlint.leetcode.medium.i0015_3sum;

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            List<int[]> sumList = twoSum(nums, i, -nums[i]);
            for (int[] sum : sumList) {
                List<Integer> list = new ArrayList();
                list.add(sum[0]);
                list.add(sum[1]);
                list.add(nums[i]);
                Collections.sort(list);
                set.add(list);
            }
        }

        return new ArrayList<>(set);
    }

    private List<int[]> twoSum(int[] nums, int pos, int sum) {
        List<int[]> ans = new ArrayList<>();
        for (int i = 0, j = nums.length - 1; i < j; ) {
            if (i == pos) {
                i++;
                continue;
            }
            if (j == pos) {
                j--;
                continue;
            }
            if (nums[i] + nums[j] == sum) {
                ans.add(new int[] {nums[i], nums[j]});
                i++;
                j--;
            } else if (nums[i] + nums[j] > sum) {
                j--;
            } else {
                i++;
            }
        }

        return ans;
    }
}
