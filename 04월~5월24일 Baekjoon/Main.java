package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		// ImmortalOrigins();
		// What();
		// multiplication();
		// Gugudan();
		// TestCase();
		// fastSum();
		// LinePrint1();
		// Count();
		// ReversCount();
		// Gozipsu();
		// Naruesys();

	}

	private static void SumCycle() {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		int check=num;
		int n=0,m=0;
		int count=0;
		while(true) {
			m = check/10;
			n = check%10;
			check = ((n%10)*10)+((m+n)%10);
			count++;
			if(num == check) {
				System.out.println(count);
				break;
			}
		}
	}

	private static void Sum5() {
		int a, b;
		Scanner sc = new Scanner(System.in);

		while (true) {

			try {
				a = sc.nextInt();
				b = sc.nextInt();
				System.out.println(a + b);
			} catch (Exception e) {
				break;
			}
		}
	}

	private static void SUM4() {
		int a, b;
		Scanner sc = new Scanner(System.in);

		while (true) {

			a = sc.nextInt();
			b = sc.nextInt();

			if (a == 0 && b == 0) {
				break;
			}

			System.out.println(a + b);
		}
	}

	private static void Smallorx() {
		int n = 0, x = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		x = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			if (a[i] < x) {
				System.out.print(a[i] + " ");
			}
		}
	}

	private static void ReStar() {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int k = n; k > i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	private static void Star() {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	private static void Sumprint() {
		int T = 0;
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		int A, B;
		for (int i = 1; i <= T; i++) {
			A = sc.nextInt();
			B = sc.nextInt();
			System.out.printf("Case #%d: %d + %d = %d\n", i, A, B, A + B);
		}
	}

	private static void ReversCount() throws IOException {
		int n = 0;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		n = Integer.parseInt(bf.readLine());
		bf.close();
		for (int i = n; i > 0; i--) {
			bw.write(i + "\n");
		}
		bw.flush();
		bw.close();
	}

	private static void Count() throws IOException {
		int n = 0;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		n = Integer.parseInt(bf.readLine());
		bf.close();
		for (int i = 1; i <= n; i++) {
			bw.write(i + "\n");
		}
		bw.flush();
		bw.close();
	}

	private static void LinePrint1() {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}
	}

	private static void fastSum() throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // 버퍼리더 인스턴스 생성, 얼마나 빨리 입력받나 보자...
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 버퍼쓰기 인스턴스 생성, 얼마나 빨리쓰나 지켜본다...

		int T = Integer.parseInt(bf.readLine());

		StringTokenizer st;

		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(bf.readLine(), " ");
			bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
		}
		bf.close();
		bw.flush();
		bw.close();
	}

	private static void ImmortalOrigins() {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		System.out.println(n - 543);
	}

	private static void What() {
		/*
		 * (A+B)%C는 ((A%C) + (B%C))%C 와 같을까? (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
		 */

		int A = 0, B = 0, C = 0;
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		sc.close();
		System.out.println((A + B) % C);
		System.out.println(((A % C) + (B % C)) % C);
		System.out.println((A * B) % C);
		System.out.println(((A % C) * (B % C)) % C);

	}

	private static void multiplication() {
		int a = 0;
		int d = 0, e = 0, f = 0;

		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		d = sc.nextInt();
		sc.close();

		f = d % 10;
		e = (d % 100 - f) / 10;
		d = d / 100;

		System.out.println(f = f * a);
		System.out.println(e = e * a);
		System.out.println(d = d * a);
		System.out.println(d * 100 + e * 10 + f);
	}

	private static void Gugudan() {
		int a;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		sc.close();

		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", a, i, a * i);
		}
	}

	private static void TestCase() {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		sc.close();
		for (int i = 0; i < n; i++) {
			System.out.printf("%d\n", a[i] + b[i]);
		}
	}

	private static void Factor() {
		int n = 0, a = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		for (int i = 1; i <= n; i++) {
			a += i;
		}
		System.out.printf("%d", a);
	}

	private static void Gozipsu() {

		int n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("고집수를 구하는 프로그램\n");
		System.out.print("10~99이하의 정수를 입력해주세요 : ");
		n = sc.nextInt();
		sc.close();
		int i = 0, j = 0;

		for (i = 10; i <= n; i++) {
			int num = 0;
			int temp = i;
			int count = 0;
			boolean flag = true;
			while (flag) {
				if ((temp / 10) != 0) {
					num = (temp / 10) * (temp % 10);
					temp = num;
					count++;
				} else if (count < 4) {
					flag = false;
				} else {
					System.out.printf("고집수: %d\n", i);
					flag = false;
				}
			}
		}
	}

	private static void Naruesys() {
		for (int i = 100; i < 1000; i++) {
			int t = (i / 100) * (i / 100) * (i / 100);
			t += (i / 10 % 10) * (i / 10 % 10) * (i / 10 % 10);
			t += (i % 10) * (i % 10) * (i % 10);
			if (i == t) {
				System.out.println("나르시스의 수: " + i);
			}
		}

	}

	private static String kim(String[] seoul) {
		String answer = "";
		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim"))
				answer += "김서방은 " + i + "에 있다.";
		}
		return answer;
	}

	public static int Countsum(int left, int right) {
		int answer = 0;

		for (int i = left; i <= right; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count % 2 == 0) {
				answer += i;
			} else {
				answer -= i;
			}
		}
		return answer;
	}

}
