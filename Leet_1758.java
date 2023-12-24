package CPHW;

public class Leet_1758 {

	public static void main(String[] args) {
		String s="001100";
//		char sa[]=s.toCharArray();
////		int count1=0;
//		int count=0;
//		char first_element=sa[0];
//		for (int i = 1; i < sa.length; i++) {
//			if(i%2==0) {
//				if(sa[i]!=first_element) {
//					count++;
//				}
//			}
//		}
//		System.out.println(count);
//		
		int n = s.length(), count = 0;
        if (n == 1)  System.out.println(0);
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0 && s.charAt(i) == '1') count++;
            if (i % 2 == 1 && s.charAt(i) == '0') count++;
        }
        System.out.println( n - count);
        System.out.println(count);
//		for (int i = 1; i < sa.length; i++) {
//			if(sa[i]==sa[i-1]) {
//				if(sa[i]=='0') {
//					sa[i]='1';
//				}
//				else if (sa[i]=='1') {
//					sa[i]='0';
//				}
//				count1++;
//			}
//		}
//		char[] sa1=s.toCharArray();
//		for (int i = sa1.length-2; i >=0; i--) {
//			
////			System.out.println(sa1[i]);
//		}
//		
		
//		System.out.println(count1);
//		System.out.println(count2);
//		System.out.println(1%2);
				
		
				
				
				
				
				
				
		

	}

}
