package Algorithm;

import java.util.Scanner;

public class aboveAvg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tcase = sc.nextInt();
		int[] arr;
		int sum = 0, cnt = 0;
		double avg = 0.0;
		for(int i=0;i<tcase;i++) {
			int n = sc.nextInt();
			double a = n;
			arr = new int[n];
			for(int j=0;j<arr.length;j++) {
				arr[j] = sc.nextInt();
				sum += arr[j];
			}
			avg = (sum/a);
			for(int k=0;k<n;k++) {
				if(arr[k]>avg) {
					cnt++;
				}
			}
			avg = (100/a)*cnt;
			System.out.printf("%.3f%%\n",avg);
			cnt=0;
			sum=0;
			avg=0;
		}
	}
}
