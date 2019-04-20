package list

object MergeTwoSortedLists {

    // Definition for singly-linked list.
    class ListNode(var _x: Int = 0) {
      var next: ListNode = _
      var x: Int = _x
    }

  def mergeTwoLists(l1: ListNode, l2: ListNode): ListNode = {
    if(l1 == null) return l2
    if(l2 == null) return l1
    var p1 = l1
    var p2 = l2
    var ll = new ListNode()
    val l = ll
    while(p1!=null&&p2!=null){
      if(p1.x > p2.x){
        ll.next = p2
        p2 = p2.next
      }else{
        ll.next = p1
        p1 = p1.next
      }
      ll = ll.next
    }
    if(p1 == null) ll.next = p2 else ll.next = p1
    l.next
  }
}
