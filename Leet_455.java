import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count = 0;
        Arrays.sort(g);
        Arrays.sort(s);

        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < s.length; j++) {
                if (g[i] <= s[j]) {
                    s[j]=0;
                    count++;
                    break; // Move to the next child after satisfying the current one
                }
            }
        }

        return count;
    }
}
