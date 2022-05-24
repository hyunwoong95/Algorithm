package Algorithm;

import java.util.Scanner;

public class Sangsu {

	public static void main(String[] args) {
		int num=0;
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[2];
		for(int i=0;i<numbers.length;i++) {
			numbers[i] = sc.nextInt();
			int df = 100;
			num = 0;
			while(numbers[i] > 0) {
				num += (numbers[i]%10) * df;
				df /= 10;
				numbers[i] /= 10;
			}
			numbers[i] = num;
		}
		if(numbers[0] > numbers[1]) {
			System.out.println(numbers[0]);
		}else {
			System.out.println(numbers[1]);
		}
	}

}
