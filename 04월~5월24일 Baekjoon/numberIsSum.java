package Algorithm;

import java.util.Scanner;

public class numberIsSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		String str = sc.next();
		sc.close();
		for(int i=0;i<n;i++) {
			sum += Integer.parseInt(str.split("")[i]);
		}
		System.out.println(sum);
	}

}
