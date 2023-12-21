package CPHW;

import CPHW.Reverse_linked_list.ListNode;

public class Remove_duplicates_from_sorted_list {
	public static class ListNode {
	     int val;
	     ListNode next;
	     ListNode() {}
	     ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }
	public static void print(ListNode head) {
		ListNode curr=head;
		while(curr!=null) {
			System.out.print(curr.val+" ");
			curr=curr.next;
		}
	}
	public static void rev(ListNode head) {
		ListNode curr=head;
		while(curr.next!=null) {
			if(curr.val==curr.next.val) {
				curr.next=curr.next.next;
			}
			else{curr=curr.next;}
		}
		
	}
	
	public static void main(String[] args) {
		ListNode list=new ListNode(1);
		list.next=new ListNode(2);
		list.next.next=new ListNode(2);
//		list.next.next.next=new ListNode(3);
//		list.next.next.next.next=new ListNode(3);
		print(list);
		System.out.println();
		rev(list);
		print(list);

	}

}
