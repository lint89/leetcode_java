/**
 * Author : Lin Tao
 * Date   : 2020/2/9
 */

/**********************************************************************************
 * com.lintlint.leetcode.easy.i0083_remove_duplicates_from_sorted_list
 *
 * 83. 删除排序链表中的重复元素
 *
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 *
 * 示例 1:
 *
 * 输入: 1->1->2
 * 输出: 1->2
 * 示例 2:
 *
 * 输入: 1->1->2->3->3
 * 输出: 1->2->3
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **********************************************************************************/

package com.lintlint.leetcode.easy.solved.i0083_remove_duplicates_from_sorted_list;

import com.lintlint.leetcode.base.ListNode;

public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode guard = new ListNode(-1);
        guard.next = head;

        if (head == null) {
            return null;
        }

        ListNode next = head.next;

        while (head != null && next != null) {
            if (head.val == next.val) {
                head.next = next.next;
            } else {
                head = head.next;
            }
            next = next.next;
        }

        return guard.next;
    }
}
