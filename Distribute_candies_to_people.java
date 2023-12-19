


public class Distribute_candies_to_people {

	public static void main(String[] args) {
		
		int nums[]= {1,2,3,4,5};
		int a;
		boolean j=false;
		for (int i = 0; i < nums.length-2; i++) {
			a=nums[i]+nums[i+1];
			int b=nums[i+1]+nums[i+2];
			if(a==b) {
				j=true;
			}
			
		}
		System.out.println(j);
		
		
		
		
	}
	

}
