package CPHW;
import java.util.Arrays;
import java.util.*;
public class remove_duplicate_from_sorted_array {

	public static void main(String[] args) {
		int nums[]= {0,0,1,1,1,2,2,3,3,4};
		int k=nums.length;
		for (int i = 0; i < nums.length-1; i++) {
			if(nums[i]==nums[i+1]) {
				nums[i]=Integer.MAX_VALUE;
				k=k-1;
			}
		}
		Arrays.sort(nums);
//		System.out.println(k);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

}
