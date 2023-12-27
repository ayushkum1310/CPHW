class Solution {
    public int minCost(String color, int[] neededTime) {
        int ans=0;
		for (int i = 0; i < color.length()-1; i++) {
			char curr=color.charAt(i);
			char next=color.charAt(i+1);
			if(curr==next) {
				ans+=Math.min(neededTime[i],neededTime[i+1]);
				neededTime[i+1]=Math.max(neededTime[i], neededTime[i+1]);
			}
		}
		return ans;
    }
}
