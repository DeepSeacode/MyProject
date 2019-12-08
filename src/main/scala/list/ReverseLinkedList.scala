package list

import damo.ListNode

/**
 * Reverse a singly linked list.
 *
 * Example:
 *
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 * Follow up:
 *
 * A linked list can be reversed either iteratively or recursively. Could you implement both?
 */
object ReverseLinkedList {
  def reverseList(head: ListNode): ListNode = {
    if (head == null || head.next == null) return head
    val res = reverseList(head.next)
    head.next.next = head
    head.next = null
    res
  }

}
