package CPHW;

//import java.util.Arrays;
//import java.util.List;

public class Lwwt_118 {

	public static void main(String[] args) {
//		Arrays[][] arr= new Arrays[3][];
//		System.out.println(arr);
		int count=1;
		int arra[][]=new int[5][];
		for (int i = 0; i < arra.length; i++) {
			arra[i]=new int[i+1];
			
			for (int j = 0; j <i; j++) {
				arra[i][j]=1;
			}
		}
		for (int i = 0; i < arra.length; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(arra[i][j]);
				
			}
			System.out.println();
		}
		
	}

}
