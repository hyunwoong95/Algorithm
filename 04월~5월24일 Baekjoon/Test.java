package Algorithm;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		System.out.println(sum(arr));

	}
	
	public static long sum(int[] a) {
		long result=10000000L;
		result = 0;
		for(int i=0;i<a.length;i++) {
			result += a[i];
		}
	
		return result;
	}
	
	
	

}
