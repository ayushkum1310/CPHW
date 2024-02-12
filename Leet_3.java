class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
		int j=0;
		int max=0;
		
		HashSet<Character> list= new HashSet<Character>();
		while(i<s.length() && j<s.length()){
            char ch=s.charAt(j);
            if(!list.contains(ch) ){
                list.add(ch);
                j++;
            }
            else{
                list.remove(s.charAt(i));
                i++;
            }
            max=Math.max(max,j-i);
        }

        return max;
    }
}
