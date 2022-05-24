package Algorithm;

import java.util.Scanner;

public class oneNumber {
	public static void main(String[] args) {
		
		arithmeticSequence();
		
	}
	
	public static void arithmeticSequence() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt=0;
		for(int i=1;i<=n;i++) {
			if(i < 100) {
				cnt++;
			}else {
				int one=i/100, two=(i/10)%10, three=i%10;
					if(one - two == two - three) {
						cnt++;
					}
			}
		}
		System.out.println(cnt);
	}

}
