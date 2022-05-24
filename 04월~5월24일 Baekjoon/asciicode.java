package Algorithm;

import java.util.Scanner;

public class asciicode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		char ch = str.charAt(0);
		int asc = ch;
		System.out.println(asc);
	}

}
