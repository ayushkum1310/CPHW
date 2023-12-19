package Ayush.Ayush;

import java.util.Iterator;

public class First_occurance_string {

	public static void main(String[] args) {
		String a="leetcode";
		String b="eet";
		int au=-1;
		for (int i = 0; i <=a.length()-b.length(); i++) {
			if(a.subSequence(i, i+b.length()).equals(b)) {
				au=i;
			}
			
		}
		System.out.println(au);
	}

}
