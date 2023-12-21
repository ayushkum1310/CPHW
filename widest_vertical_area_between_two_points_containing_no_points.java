package CPHW;
import java.util.*;
public class widest_vertical_area_between_two_points_containing_no_points {

	public static void main(String[] args) {
		int arr[][]= {{8,7},{9,9},{7,4},{9,7}};
		Arrays.sort(arr,(a,b)-> Integer.compare(a[0], b[0]));
		
		System.out.println(arr[0].length);
		int max=0;
//		System.out.println(a);
		for (int i =1; i < arr.length; i++) {
			max=Math.max(max,arr[i][0]-arr[i-1][0]);
		}
		System.out.println(max);
	}

}
