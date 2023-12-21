package CPHW;

public class Reverse_Integer {
	public static int Rev(int x) {
		try {
			if(x<0) {
				x=x*-1;
				String S=Integer.toString(x);
				
				StringBuilder Sn=new StringBuilder(S);
				Sn=Sn.reverse();
				String snew=Sn.toString();
				int sni=Integer.parseInt(snew);
			
				return sni*-1;
				}
			
			String S=Integer.toString(x);
			
			StringBuilder Sn=new StringBuilder(S);
			Sn=Sn.reverse();
			String snew=Sn.toString();
			int sni=Integer.parseInt(snew);
			return sni;
		} catch (Exception e) {
			return 0;
		}
		
	
		
	}
	public static void main(String[] args) {
		int a=1534236469;
//		System.out.println(a);
		int b=Rev(a);
		System.out.println(b);
//		int c=a*-1;
//		System.out.println(c);
		

	}

}
