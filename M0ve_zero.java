package CPHW;

public class M0ve_zero {

	public static void main(String[] args) {
		int nums[]= {1,2,3,0,7,8,9,0};
		for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-1;j++){
                if(nums[j]==0 && nums[j+1]!=0){
                    int temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
                }
            }
        }
        for(int j=0;j<nums.length;j++){
            System.out.println(nums[j]);

        }

	}

}
