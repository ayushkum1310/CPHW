package CPHW;

import java.util.HashMap;
import java.util.Stack;

public class Valid_parentnesis {

	public static void main(String[] args) {
		String s="(";
		HashMap<Character, Character> ch=new HashMap<Character, Character>();
		try{ch.put(')', '(');
		ch.put('}', '{');
		ch.put(']', '[');
		if(s.length()==1){
            System.out.println(false);
        }
        if(s.charAt(0)==')' || s.charAt(0)==']' || s.charAt(0)=='}'){
        	System.out.println(false);
        }
		Stack<Character> list=new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)==')' || s.charAt(i)==']' || s.charAt(i)=='}') {
				if(list.peek()==ch.get(s.charAt(i)) ){
					list.pop();
				}
				else {
					System.out.println(false);
					break;
				}
				
			}
			
			if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{') {
				list.add(s.charAt(i));
			}
		}
		System.out.println(list.isEmpty());
		
        }
        catch(Exception e){
        	System.out.println(false);

        }
		
		
	}

}
