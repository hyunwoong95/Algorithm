package Algorithm;

import java.util.Scanner;

public class findAlphabet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		char ch = 'a';
		for(int i=0;i<26;i++) {
			int index = 0;
			index = S.indexOf(ch);
			System.out.print(index + " ");
			ch += 1;
		}
	}

}
