/**
 * Author : Lin Tao
 * Date   : 2020/1/25
 */

/**********************************************************************************
 * com.lintlint.leetcode.vip.i0163_missing_rages
 *
 * 163. 缺失的区间
 *
 * 给定一个排序的整数数组 nums ，其中元素的范围在 闭区间 [lower, upper] 当中，返回不包含在数组中的缺失区间。
 *
 * 示例：
 *
 * 输入: nums = [0, 1, 3, 50, 75], lower = 0 和 upper = 99,
 * 输出: ["2", "4->49", "51->74", "76->99"]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/missing-ranges
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **********************************************************************************/

package com.lintlint.leetcode.vip.i0163_missing_rages;

import java.util.*;

public class MissingRages {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < lower) {
                continue;
            }

            if (nums[i] > upper) {
                continue;
            }

            if (nums[i] - nums[i + 1] == 1) {
                continue;
            }

            if (nums[i] - nums[i + 1] == 2) {
                result.add(String.valueOf(nums[i]));
            }

            if (nums[i] - nums[i + 1] > 2) {
                result.add(nums[i] + "->" + nums[i + 1]);
            }
        }

        return result;
    }
}

