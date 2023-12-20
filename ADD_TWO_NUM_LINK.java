package CPHW;
import java.math.BigInteger;
import java.util.*;
public class ADD_TWO_NUM_LINK {
	static ListNode head;
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		
		
    };
    
    public static void print(ListNode head) {
    	ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
    }
    }
    public static String reversed(ListNode head) {
    	ListNode curr=head;
    	String n="";
    	while (curr!=null) {
			n=n+Integer.toString(curr.val);
			curr=curr.next;
		}
    	
    	String b="";
		for (int i = n.length()-1; i>=0; i--) {
			b=b+n.charAt(i);
//			System.out.println(a.charAt(i));
		}
    	
    	return b;
    }
    public static void insert( ListNode au,int value ) {
    	
    	ListNode curr=au;
    	
    	while (curr.next!=null) {
			curr=curr.next;
		}
    	curr.next=new ListNode(value);
    	
    }
    
    public void addFirst(int data) {
    	ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }

	public static void main(String[] args) {
		
		ListNode a=new ListNode(9);
		
		
		
		
		ListNode b=new ListNode(1);
//		
		insert(b,9);
		insert(b,9);
		insert(b,9);
		insert(b,9);
		insert(b,9);
		insert(b,9);
		insert(b,9);
		insert(b,9);
		insert(b,9);
//		
		String k=reversed(a);
		String k2=reversed(b);
		
		BigInteger newk=new BigInteger(k);
		BigInteger newk2=new BigInteger(k2);
		BigInteger sum=newk.add(newk2);
		String sum2=sum.toString();
		System.out.println(sum2);
		
		ListNode no=new ListNode();
		for (int i = sum2.length()-1;i>=0; i--) {
			char va=sum2.charAt(i);
			int val=Character.getNumericValue(va);
			insert(no,val);
			
			
		}
		print(no.next);
		
		
		
		
		
		
		
			

	}



	

}
