package list

import damo.ListNode

/**
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 *
 * Example 1:
 *
 * Input: 1->1->2
 * Output: 1->2
 * Example 2:
 *
 * Input: 1->1->2->3->3
 * Output: 1->2->3
 */
object RemoveDuplicatesFromSortedList {

  def deleteDuplicates(head: ListNode): ListNode = {
    if(head == null || head.next == null) return head

    val res = head
    var pre = head
    var cur = head.next
    while (cur != null){
      if(cur.x == pre.x){
        pre.next = cur.next
      }else{
        pre.next = cur
        pre = cur
      }
      cur = cur.next
    }
    res
  }
}
