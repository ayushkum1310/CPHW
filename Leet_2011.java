class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int cnt =0;
        for(String s : operations){
            if(s.charAt(0)=='+' || s.charAt(2)=='+') cnt++;
            else cnt--;
        }
        return cnt;
    }
}
