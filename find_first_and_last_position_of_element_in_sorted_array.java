package CPHW;
import java.util.*;
public class find_first_and_last_position_of_element_in_sorted_array {
	
	
	public static int[] sr(int[] arr,int target ) {
		int list[]= {-1,-1};
		for (int i = 0; i <arr.length; i++) {
			if(arr[i]==target) {
				list[0]=i;
				break;
			}
		}
		for (int i =arr.length-1; i >=0; i--) {
			if(arr[i]==target) {
				list[1]=i;
				break;
			}
		}
		return list;
	}

	public static void main(String[] args) {
		int arr[]= {1,2};
		int target=2;
		int a[]=sr(arr,target);
//		System.out.println(Arrays.binarySearch(arr,target));
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.println(a[i]);
			
		}
	}

}
