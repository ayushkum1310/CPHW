package CPHW;

public class Palindrome_Number {

	public static void main(String[] args) {
		int a=121;
		String s=Integer.toString(a);
		StringBuilder ab=new StringBuilder(s);
		
		ab.reverse();
		String snew=ab.toString();
		
		System.out.println(s.equals(snew));
		

	}

}
