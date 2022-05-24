package Algorithm;

import java.util.Scanner;

public class OXQuiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] Tcase = new String[sc.nextInt()];
		String str = "";
		int cnt=0,sum=0;
		for(int i=0;i<Tcase.length;i++) {
			str = sc.next();
			Tcase[i] = str;
			for(int j=0;j<Tcase[i].length();j++) {
				if(Tcase[i].charAt(j)=='O') {
					cnt++;
					sum +=cnt;
				}else {
					cnt=0;
				}
			}
			System.out.println(sum);
			sum=0;
			cnt=0;
		}
		sc.close();
	
		/*
		Scanner sc = new Scanner(System.in);
		Scanner st = new Scanner(System.in);
		String str = "";
		int n = 0;
		int cnt = 0,sum = 0;
		n = sc.nextInt();
		for(int i=0;i<n;i++) {
			str = st.nextLine();
			for(int j=0;j<str.length();j++) {
				if(str.charAt(j) == 'O') {
					cnt++;
					sum += cnt;
				}else {
					cnt=0;
				}
			}
			System.out.println(sum);
			cnt=0;
			sum=0;
		}
		*/
	}

}
