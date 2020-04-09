/**
 * Author : Lin Tao
 * Date   : 2020/2/26
 */

/**********************************************************************************
 * com.lintlint.leetcode.easy.i0349_intersection_of_two_arrays
 *
 * 349. 两个数组的交集
 *
 * 给定两个数组，编写一个函数来计算它们的交集。
 *
 * 示例 1:
 *
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2]
 * 示例 2:
 *
 * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出: [9,4]
 * 说明:
 *
 * 输出结果中的每个元素一定是唯一的。
 * 我们可以不考虑输出结果的顺序。
 **********************************************************************************/

package com.lintlint.leetcode.easy.temp.i0349_intersection_of_two_arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                temp.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }

        int[] result = new int[temp.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = temp.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2, 2};
        IntersectionOfTwoArrays obj = new IntersectionOfTwoArrays();
        obj.intersection(nums1, nums2);
    }
}
