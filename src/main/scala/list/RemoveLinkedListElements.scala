package list

import damo.ListNode

/**
 * Remove all elements from a linked list of integers that have value val.
 *
 * Example:
 *
 * Input:  1->2->6->3->4->5->6, val = 6
 * Output: 1->2->3->4->5
 */
object RemoveLinkedListElements {
  def removeElements(head: ListNode, `val`: Int): ListNode = {


    var h = head
    while (h!= null && h.x ==`val`)h = h.next
    if(h == null) return h
    var p1 = h
    var p2 = h

    while (p2 != null){
      if(p2.x == `val`) {
        p1.next = p2.next
      }
      else{
        p1 = p2
      }
      p2 = p2.next
    }
    h
  }
}
