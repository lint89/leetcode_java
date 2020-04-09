/**
 * Author : Lin Tao
 * Date   : 2020/2/12
 */

/**********************************************************************************
 * com.lintlint.leetcode.easy.i0203_remove_linked_list_elements
 *
 * 203. 移除链表元素
 *
 * 删除链表中等于给定值 val 的所有节点。
 *
 * 示例:
 *
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 **********************************************************************************/

package com.lintlint.leetcode.easy.solved.i0203_remove_linked_list_elements;

import com.lintlint.leetcode.base.ListNode;

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode guard = new ListNode(-1);
        guard.next = head;

        ListNode prev = guard, cur = head;
        while (cur != null) {
            if (head.val == val) {
                prev.next = cur.next;
            } else {
                prev = cur;
            }
            cur = cur.next;
        }

        return guard.next;
    }
}
