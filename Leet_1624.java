class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int len=-1;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j < s.length(); j++) {
				if(s.charAt(i)==s.charAt(j)) {
					len=Math.max(len, j-i-1);
				}
			}
		}
        return len;
    }
}
