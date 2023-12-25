class Solution {
    public int[] countBits(int n) {
        int nums[]=new int[n+1];
		nums[0]=0;
		if (n==0) {
			System.out.println(nums);
		}
		for (int i = 1; i <=n; i++) {
			
			String s=Integer.toBinaryString(i);
			int count=0;
			for (int j = 0; j < s.length(); j++) {
				if(s.charAt(j)=='1') {
					count++;
				}
			}
			nums[i]=count;
		
		}
        return nums;
    }
}
