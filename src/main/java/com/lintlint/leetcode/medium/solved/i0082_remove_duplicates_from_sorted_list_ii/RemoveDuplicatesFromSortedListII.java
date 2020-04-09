/**
 * Author : Lin Tao
 * Date   : 2020/3/27
 */

/**********************************************************************************
 * com.lintlint.leetcode.medium.i0082_remove_duplicates_from_sorted_list_ii
 *
 * 82. 删除排序链表中的重复元素 II
 *
 * 给定一个排序链表，删除所有含有重复数字的节点，只保留原始链表中 没有重复出现 的数字。
 *
 * 示例 1:
 *
 * 输入: 1->2->3->3->4->4->5
 * 输出: 1->2->5
 * 示例 2:
 *
 * 输入: 1->1->1->2->3
 * 输出: 2->3
 **********************************************************************************/

package com.lintlint.leetcode.medium.solved.i0082_remove_duplicates_from_sorted_list_ii;

import com.lintlint.leetcode.base.ListNode;

import java.util.HashMap;

public class RemoveDuplicatesFromSortedListII {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy.next;

        HashMap<Integer, Integer> map = new HashMap<>();

        while (cur != null) {
            map.put(cur.val, map.getOrDefault(cur.val, 0) + 1);
            cur = cur.next;
        }

        cur = dummy.next;
        ListNode father = dummy;
        while (cur != null) {
            if (map.get(cur.val) > 1) {
                father.next = cur.next;
            } else {
                father = cur;
            }
            cur = cur.next;
        }

        return dummy.next;
    }
}
