package Algorithm;

import java.util.Scanner;

public class SUBTRACT {

	public static void main(String[] args) {
		int A=0,B=0;
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		sc.close();
		System.out.println(A+B);
        System.out.println(A-B);
        System.out.println(A*B);
        System.out.println((double)A/B);
        System.out.println(A%B);

	}

}
