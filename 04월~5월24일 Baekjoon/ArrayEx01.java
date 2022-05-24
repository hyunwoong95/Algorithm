package Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx01 {

	public static void main(String[] args) {
		
		int n = 0;
		int min=0, max=0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();		
		}
		Arrays.sort(a);
		max = a[n-1];
		min = a[0];
		System.out.printf("%d %d",min,max);

	}

}
