/**
 * Author : Lin Tao
 * Date   : 2020/2/12
 */

/**********************************************************************************
 * com.lintlint.leetcode.easy.i0206_reverse_linked_list
 *
 * 206. 反转链表
 *
 * 反转一个单链表。
 *
 * 示例:
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-linked-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **********************************************************************************/

package com.lintlint.leetcode.easy.temp.i0206_reverse_linked_list;

import com.lintlint.leetcode.base.ListNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();

        while (head != null) {
            stack.push(head);
            head = head.next;
        }

        ListNode reverse = new ListNode(-1);
        ListNode temp = stack.pop();
        reverse.next = temp;
        while (stack.isEmpty()) {
            temp.next = stack.pop();
            temp = temp.next;
        }

        return reverse.next;
    }
}
