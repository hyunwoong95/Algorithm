package Algorithm;

import java.util.Scanner;

/*
크로아티아 알파벳|	변경
             č	         |   c=
             ć	         |   c-
     dž	         |   dz=
     đ	         |   d-
     lj	         |   lj
     nj	         |   nj
             š	         |   s=
             ž	         |   z=
*/

public class CroatiaAlph {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] Alph = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		String str = sc.nextLine();
		sc.close();
		for(int i=0;i<Alph.length;i++) {	// 길이가 다른 특수알파벳을 개수만큼 비교할것이다.
			if(str.contains(Alph[i])) {		// 특수 알파벳이 있다면
				str = str.replace(Alph[i], "!");	// 그문자를 찾아 "!"로 변환하고
			}
		}
		System.out.println(str.length()); // 특수문자들이 "!"하나로 변환되어 1문자로 셀수가있다.
	}
}
