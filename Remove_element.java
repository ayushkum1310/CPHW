package Ayush.Ayush;

//import java.lang.reflect.Array;
import java.util.Arrays;

import io.netty.channel.MaxBytesRecvByteBufAllocator;
import net.bytebuddy.asm.Advice.OffsetMapping.Sort;

public class Remove_element {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		int nums[]= {0,1,2,2,3,0,4,2};
		int k=nums.length;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]==2) {
				k=k-1;
				nums[i]=Integer.MAX_VALUE ;	
			}
		}
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			
			System.out.println(nums[i]);
		}
	}

}
