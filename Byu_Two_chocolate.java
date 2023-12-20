package CPHW;
import java.util.*;
public class Byu_Two_chocolate {

	public static void main(String[] args) {
		
		int prices[]= {98,54,6,34,66,63,52,39};
		Arrays.sort(prices);
		int money=62;
		int k=money;
		int num_choco=0;
		for (int i = 0; i < prices.length; i++) {
			if(prices[i]<=money ) {
				money=money-prices[i];
				num_choco=num_choco+1;
				if (num_choco==2) {
					System.out.println(money);
				}
				
			}
			
		}
		if (num_choco!=2) {
			
			System.out.println(k);
		}

	}

}
