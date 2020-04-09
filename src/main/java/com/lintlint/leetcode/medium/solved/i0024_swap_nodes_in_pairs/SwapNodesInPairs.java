/**
 * Author : Lin Tao
 * Date   : 2020/3/27
 */

/**********************************************************************************
 * com.lintlint.leetcode.medium.i0024_swap_nodes_in_pairs
 *
 * 24. 两两交换链表中的节点
 *
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 *
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 *
 * 示例:
 *
 * 给定 1->2->3->4, 你应该返回 2->1->4->3.
 **********************************************************************************/

package com.lintlint.leetcode.medium.solved.i0024_swap_nodes_in_pairs;

import com.lintlint.leetcode.base.ListNode;

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode father = dummy;
        ListNode cur = dummy.next;

        while (cur != null && cur.next != null) {
            father.next = cur.next;
            cur.next = cur.next.next;
            father.next.next = cur;
            father = cur;
            cur = cur.next;
        }

        return dummy.next;
    }
}
