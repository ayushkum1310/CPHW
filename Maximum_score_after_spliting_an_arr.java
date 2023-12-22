package CPHW;

public class Maximum_score_after_spliting_an_arr {

	public static void main(String[] args) {
		String s="1111";
		int max=0;
		for (int i = 1; i < s.length(); i++) {
			int zero = 0;int one=0;
			String s1=s.substring(0,i);
			String s2=s.substring(i,s.length());
			
			for (int j = 0; j < s1.length(); j++) {
				if(s1.charAt(j)=='0') {
					zero=zero+1;
					}
				}
			for (int j = 0; j < s2.length(); j++) {
				if(s2.charAt(j)=='1') {
					one=one+1;
					}
			}
			int sum=zero+one;
			max=Math.max(max,sum);
			
			
			}
			System.out.println(max);
		
	
	}
}
