package Algorithm;

import java.util.Scanner;

public class stringRepeat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0;i<T;i++) {
			int num = sc.nextInt();
			String S = sc.next();
			for(int j=0;j<S.length();j++) {
				for(int k=0;k<num;k++) {
					char ch = S.charAt(j);
					System.out.print(ch);
				}
			}
			System.out.println();
		}
	}

}
