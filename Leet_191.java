package CPHW;

import java.math.BigInteger;

public class Leet_191 {
	public static int hammingWeight(int n) {
        String s=Integer.toBinaryString(n);
		int count=0;
		for (int i = 0; i <s.length(); i++) {
			if(s.charAt(i)=='1') {
				count++;
			}
		}
		return count;
    }
	
	public static void main(String[] args) {
		
		 
		 

	}

}
