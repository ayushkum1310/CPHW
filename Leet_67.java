package CPHW;

import java.math.BigInteger;

public class Leet_67 {

	public static void main(String[] args) {
		String a="11";
		String b="1";
		BigInteger num1=new BigInteger(a, 2);
		BigInteger num2=new BigInteger(b, 2);
		
		BigInteger sum =num1.add(num2);
		System.out.println(sum.toString(2)) ;

	}

}
