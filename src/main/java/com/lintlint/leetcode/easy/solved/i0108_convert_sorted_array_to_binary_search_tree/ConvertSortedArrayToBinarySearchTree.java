/**
 * Author : Lin Tao
 * Date   : 2020/2/9
 */

/**********************************************************************************
 * com.lintlint.leetcode.easy.i0108_convert_sorted_array_to_binary_search_tree
 *
 * 108. 将有序数组转换为二叉搜索树
 *
 * 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
 *
 * 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
 *
 * 示例:
 *
 * 给定有序数组: [-10,-3,0,5,9],
 *
 * 一个可能的答案是：[0,-3,9,-10,null,5]，它可以表示下面这个高度平衡二叉搜索树：
 *
 *       0
 *      / \
 *    -3   9
 *    /   /
 *  -10  5
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **********************************************************************************/

package com.lintlint.leetcode.easy.solved.i0108_convert_sorted_array_to_binary_search_tree;

import com.lintlint.leetcode.base.TreeNode;

public class ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        return sortedArrayToBSTByIndex(nums, 0, nums.length - 1);
    }

    private TreeNode sortedArrayToBSTByIndex(int[] nums, int left, int right) {
        if (left == right) {
            return new TreeNode(nums[left]);
        }

        int mid = (left + right) / 2;
        TreeNode head = new TreeNode(nums[mid]);
        if (left <= mid - 1) {
            head.left = sortedArrayToBSTByIndex(nums, left, mid - 1);
        }
        if (mid + 1 <= right) {
            head.right = sortedArrayToBSTByIndex(nums, mid + 1, right);
        }

        return head;
    }
}
