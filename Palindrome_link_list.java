package CPHW;

public class Palindrome_link_list {
	public static class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		 }
	public static boolean palen(ListNode head) {
		boolean flag=false;
		String s="";
		
		ListNode curr=head;
		while(curr!=null) {
			s=s+Integer.toString(curr.val);
			curr=curr.next;
		}
		StringBuilder sc=new StringBuilder(s);
		sc.reverse();
		String n=sc.toString();
		if(s.equals(n)) {
			flag=true;
		}
		
		
		
		
		
		return flag;
	}
	public static void print(ListNode head) {
		ListNode curr=head;
		while(curr!=null) {
			System.out.print(curr.val+" ");
			curr=curr.next;
		}
	}
	public static void main(String[] args) {
		ListNode list=new ListNode(1);
		list.next=new ListNode(2);
		list.next.next=new ListNode(2);
		list.next.next.next=new ListNode(2);
		print(list);
		boolean a=palen(list);
		System.out.println(a);
		
		

	}

}
