package CPHW;

public class Leet_125 {

	public static void main(String[] args) {
		String n="Gyanko in huju";
		n=n.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		String prev=n;
		StringBuilder newer=new StringBuilder(n);
		
		newer.reverse();
		String latest=newer.toString();
		System.out.println(latest.equals(prev));
		
//		System.out.println(newer);
//		System.out.println(prev);
		

	}

}
