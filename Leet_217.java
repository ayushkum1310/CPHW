package CPHW;
import java.util.Arrays;
public class Leet_217 {

	public static void main(String[] args) {
		int nums[]= {1,2,3,4,5};
		Arrays.sort(nums);
		boolean flag=false;
		
		for (int i = 0; i < nums.length-1; i++) {
			if(nums[i]==nums[i+1]) {
				flag=true;
				break;
			}
		}
		System.out.println(flag);
		

	}

}
