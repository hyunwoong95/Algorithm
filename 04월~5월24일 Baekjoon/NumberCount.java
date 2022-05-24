package Algorithm;

import java.util.Scanner;

public class NumberCount {

	public static void main(String[] args) {
		int result = 1, num = 0, index = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			num = sc.nextInt();
			result = result * num;
		}
		int[] arr = new int[10];
		while (true) {
			if (result > 10) {
				index = result % 10;
				arr[index] += 1;
				result /= 10;
			} else {
				index = result;
				arr[index] += 1;
				break;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
