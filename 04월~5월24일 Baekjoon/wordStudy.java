package Algorithm;

import java.util.Scanner;

public class wordStudy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next().toUpperCase();
		int[] alph = new int[26]; // 0부터25까지 a~b표현
		sc.close();
		int max = 0;
		char ch=' ';
		for(String st : word.split("")) {
			char ch1 = st.charAt(0);
				alph[ch1 - 65]++;
		}
		for (int i = 0; i < alph.length; i++) {
			if (alph[i] > max) {
				max = alph[i];
				ch = (char)(i + 'A');
			}else if(alph[i] == max) {
				ch = '?';
			}
		}
		System.out.println(ch);
	}

}
