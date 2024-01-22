class Solution {
   
    public int[][] merge(int[][] nums) {
        Arrays.sort(nums,Comparator.comparingInt(a->a[0]));
		
		
		List<List<Integer>> res=new ArrayList<List<Integer>>();
		List<Integer> ar=new ArrayList<Integer>();
		ar.add(nums[0][0]);
		ar.add(nums[0][1]);
		for (int i = 1; i < nums.length; i++) {
			if(nums[i][0]<=ar.getLast()) {
                if(nums[i][1]>ar.getLast()){

				ar.removeLast();
				ar.add(nums[i][1]);
                }
			}
			else {
				ar.add(nums[i][0]);
				ar.add(nums[i][1]);
			}
			
		}
		int newar[][]=new int[ar.size()/2][2];
		int k=0;
		for (int i = 0; i < newar.length; i++) {
			for (int j = 0; j < newar[0].length; j++) {
				newar[i][j]=ar.get(k);
				k++;
			}
		}
        return newar;
    }
}
