class Solution {
    public int removeDuplicates(int[] nums) {
        int length=nums.length;
		
		for (int i = 2; i < nums.length; i++) {
			if(nums[i]==nums[i-2]) {
				nums[i-2]=Integer.MAX_VALUE;
				length--;
			}
		}
		Arrays.sort(nums);
		return length;
    }
}
