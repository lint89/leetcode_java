/**
 * Author : Lin Tao
 * Date   : 2020/3/27
 */

/**********************************************************************************
 * com.lintlint.leetcode.medium.i0061_rotate_list
 *
 * 61. 旋转链表
 *
 * 给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。
 *
 * 示例 1:
 *
 * 输入: 1->2->3->4->5->NULL, k = 2
 * 输出: 4->5->1->2->3->NULL
 * 解释:
 * 向右旋转 1 步: 5->1->2->3->4->NULL
 * 向右旋转 2 步: 4->5->1->2->3->NULL
 * 示例 2:
 *
 * 输入: 0->1->2->NULL, k = 4
 * 输出: 2->0->1->NULL
 * 解释:
 * 向右旋转 1 步: 2->0->1->NULL
 * 向右旋转 2 步: 1->2->0->NULL
 * 向右旋转 3 步: 0->1->2->NULL
 * 向右旋转 4 步: 2->0->1->NULL
 **********************************************************************************/

package com.lintlint.leetcode.medium.solved.i0061_rotate_list;

import com.lintlint.leetcode.base.ListNode;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy.next;

        int len = 0;
        while (cur != null) {
            len++;
            cur = cur.next;
        }

        if (len == 0) {
            return null;
        }

        int i = 0;
        ListNode first = dummy.next;
        ListNode second = dummy.next;
        ListNode last = null;
        while (first != null) {
            if (first.next == null) {
                last = first;
            }
            first = first.next;
            if (i < k % len + 1) {
                i++;
                continue;
            }
            second = second.next;
        }

        last.next = dummy.next;
        dummy = second.next;
        second.next = null;

        return dummy;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);

        RotateList obj = new RotateList();
        obj.rotateRight(head, 4);
    }
}
