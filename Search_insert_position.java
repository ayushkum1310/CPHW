package CPHW;



public class Search_insert_position {
	public static int searchInsert(int[] nums, int target) {int start = 0;
    int end = nums.length-1;

    while (start <= end) {
        int mid = (start + end)/2;
        if (nums[mid] == target) return mid;
        else if (nums[mid] > target) end = mid-1;
        else start = mid+1;
    }

    return start;
    
}

	public static void main(String[] args) {
		int nums[]= {1,3,5,6};
		int a=searchInsert(nums,5);
		System.out.println(a);
	}


}
