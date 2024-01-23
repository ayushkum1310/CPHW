import java.util.* ;
import java.io.*; 
public class Solution {
    public static long getInversions(long arr[], int n) {
        long count=0;
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr.length; j++) {
				if(i<j) {
					if(arr[i]>arr[j]) {
						
						count++;
					}
				}
			}
			
			
			
		}
		return count;
    }
}
