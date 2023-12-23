package CPHW;

public class Leet_2960 {

	public static void main(String[] args) {
		int nums[]= {0,1,2};
		int count=0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]>0) {
				count++;
				for (int j = i+1; j < nums.length; j++) {
					if(nums[j]>0) {
						nums[j]--;
					}
				}
			}
		}
		System.out.println(count);

	}

}
