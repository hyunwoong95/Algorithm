package Algorithm;

import java.util.Scanner;

public class AvgValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int max=0;
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		double avg = 0.0;
		for(int i=0;i<n;i++) {
			avg += ((double)arr[i]/max*100);
		}
		avg = avg/n;
		System.out.printf("%6f",avg);
		

	}

}
