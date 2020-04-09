/**
 * Author : Lin Tao
 * Date   : 2020/3/27
 */

/**********************************************************************************
 * com.lintlint.leetcode.medium.i0019_remove_nth_node_from_end_of_list
 *
 * 19. 删除链表的倒数第N个节点
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 *
 * 示例：
 *
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 *
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * 说明：
 *
 * 给定的 n 保证是有效的。
 *
 * 进阶：
 *
 * 你能尝试使用一趟扫描实现吗？
 **********************************************************************************/

package com.lintlint.leetcode.medium.solved.i0019_remove_nth_node_from_end_of_list;

import com.lintlint.leetcode.base.ListNode;

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;

        int i = 0;
        while (first != null) {
            first = first.next;
            if (i < n + 1) {
                i++;
                continue;
            }
            second = second.next;
        }

        second.next = second.next.next;

        return dummy.next;
    }
}
