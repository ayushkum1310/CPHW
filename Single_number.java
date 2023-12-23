package CPHW;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class Single_number {

	public static void main(String[] args) {
		int nums[]= {-1,2,2,3,3,4,4};
		
		Arrays.sort(nums);
		HashMap<Integer,Integer> hash=new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int cout=0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[i]==nums[j]) {
					cout++;
				}
				}
			
			if(cout==1) {
				System.out.println(nums[i]);
				break;
			}
		}
//		
	}

}
