package Algorithm;

import java.util.Scanner;
import java.util.StringTokenizer;

public class WordCount {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		/*
		String[] words = str.split(" ");	
		System.out.println(words.length);
		sc.close();	
		*/
		
		StringTokenizer tk = new StringTokenizer(str," ");
		System.out.println(tk.countTokens());

		
		
	}
}
