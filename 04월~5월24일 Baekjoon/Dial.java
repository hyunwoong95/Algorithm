package Algorithm;

import java.util.Scanner;

public class Dial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = null;
		int time = 0, i = 0; // 1을 누르려면 2초가 소요가되기때문에 2초를 기본으로 가져간다.
		String[] buttonalph = {null,"ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
		str = sc.nextLine();
		sc.close();
		while(i<str.length()) {
			time += 2;
			char ch = str.charAt(i);
			System.out.println(ch);
			for(int j=1;j<buttonalph.length;j++) {
				if(buttonalph[j].indexOf(ch)>=0) {
					time += (j+1)-1;
				}
			}
			i++;
		}
		System.out.println(time);
	}
}
