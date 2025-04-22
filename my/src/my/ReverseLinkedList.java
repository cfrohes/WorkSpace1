package my;

public class ReverseLinkedList {
	 public ListNode reverseList(ListNode head) {
	        ListNode prev = null;
	        ListNode current = head;
	        ListNode next = null;

	        while (current != null) {
	            next = current.next;
	            current.next = prev;
	            prev = current;
	            current = next;
	        }

	        return prev;
	    }

	

}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}


