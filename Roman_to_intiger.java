package CPHW;

import java.util.HashMap;

public class Roman_to_intiger {

	public static void main(String[] args) {
		HashMap<Character, Integer> a=new HashMap<>();
		a.put('I',1);
		a.put('V',5);
		a.put('X',10);
		a.put('L',50);
		a.put('C',100);
		a.put('D',500);
		a.put('M',1000);
		
		String s="LVIII";
		char ls=s.charAt(s.length()-1);
		
		
		int add=a.get(ls);
		
		for (int i = s.length()-2; i >= 0; i--) {
			if(a.get(s.charAt(i))<a.get(s.charAt(i+1))) {
				add=add-a.get(s.charAt(i));
				
			}
			else{add=add+a.get(s.charAt(i));}
			
		}
//		a.get(last);
		System.out.println(add);
	}
	
}