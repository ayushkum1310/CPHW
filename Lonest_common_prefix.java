package CPHW;
import java.util.*;
public class Lonest_common_prefix {

	public static void main(String[] args) {
		String strs[] = {"flll","flw","flight"};
		Arrays.sort(strs);
		String a=strs[0];
		String b=strs[strs.length-1];
		int i=0;
		while(i<a.length()&& i<b.length()) {
			if(a.charAt(i)==b.charAt(i)){
				i++;
			}
			else {
			break;}
		}
		
		String re=a.substring(0, i);
		System.out.println(re+" "+i);
		
		

	}

}
