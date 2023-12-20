package CPHW;

import java.util.List;
import java.util.Stack;

public class Reverse_linked_list {
	public static class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		 }
	public static String num(ListNode head) {
		String s="";
		ListNode curr=head;
		while(curr!=null) {
			s=s+Integer.toString(curr.val);
			curr=curr.next;
		}
		return s;
	}
	public static void insert(ListNode head,int val) {
		ListNode curr=head;
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=new ListNode(val);
	}
	public static void print(ListNode head) {
		ListNode curr=head;
		while(curr!=null) {
			System.out.print(curr.val+" ");
			curr=curr.next;
		}
	}
	public static ListNode reply(ListNode head) {
		ListNode list=new ListNode();
		ListNode curr=head;
		Stack<Integer> a=new Stack<Integer>();
		while(curr!=null) {
			a.push(curr.val);
			curr=curr.next;
		}
		for(int i=a.size()-1;i>=0;i--) {
			insert(list, a.pop());
		}
		return list;
	}
	public static void main(String[] args) {
		ListNode list=new ListNode(0);
		list.next=new ListNode(1);
		list.next.next=new ListNode(4);
		list.next.next.next=new ListNode(-2);
		print(list);
		System.out.println();
		ListNode a=reply(list);
		print(a.next);
	
//		Stack<Integer> a=new Stack<Integer>();
//		a.push(0);
//		a.push(1);
//		a.push(4);
//		a.push(-2);
//		System.out.println(a.size());
//		for (int i = a.size()-1; i >=0; i--) {
//			System.out.println(a.pop());
//			
//		}
		

	}

}
