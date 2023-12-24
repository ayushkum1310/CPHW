package CPHW;

import java.security.KeyStore.Entry;
import java.util.HashMap;

public class Leet_169 {

	public static void main(String[] args) {
		int nums[]= {2,2,1,1,1,2,2};
		HashMap<Integer, Integer> hash=new HashMap<Integer, Integer>();
		
		
		for (int i = 0; i < nums.length; i++) {
			int count=0;
			for (int j = 0; j < nums.length; j++) {
				if(nums[i]==nums[j]) {
					count++;
				}
			}
			hash.put(nums[i], count);
		}
		int max_feq=0;
		for (HashMap.Entry<Integer, Integer> entry : hash.entrySet()) {
			if(entry.getValue()>max_feq) {
				max_feq=entry.getValue();
			}
			
		}
		int num=0;
		for (HashMap.Entry<Integer, Integer> entry : hash.entrySet()) {
			if(entry.getValue()==max_feq) {
				num=entry.getKey();
			}
			
		}
		System.out.println(num);
	}

}
