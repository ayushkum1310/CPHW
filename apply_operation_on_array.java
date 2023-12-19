package CPHW;

public class apply_operation_on_array {

	public static void main(String[] args) {
		int nums[]= {847,847,0,0,0,399,416,416,879,879,206,206,206,272};
		for (int i = 0; i < nums.length-1; i++) {
			if(nums[i]==nums[i+1]) {
				nums[i]=nums[i]*2;
				nums[i+1]=0;
			}
			
		}
		for (int j = 0; j < nums.length; j++) {
			
		
			for (int i = 0; i < nums.length-1; i++) {
				if(nums[i]==0 && nums[i+1]!=0) {
					int temp=nums[i];
					nums[i]=nums[i+1];
					nums[i+1]=temp;
					
				}
			}
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

}
