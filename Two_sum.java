package Ayush.Ayush;

public class Two_sum {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]=new int[2];
		for(int i=0;i<a.length;i++) {
        	for (int j =i+1; j < a.length; j++) {
				if(a[i]+a[j]==6) {			
					b[0]= i;
					b[1]=j;
					 	}
			}
		

	}
		System.out.println(b[0]+","+b[1]);

   }
	
}
