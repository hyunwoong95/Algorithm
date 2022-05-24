package Algorithm;


import java.util.HashSet;
import java.util.Scanner;

public class Remain {
	public static void main(String[] args) {
		/*
		int[] arr = new int[10];
		int[] arr1 = new int[41];
		int n = 0;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
			arr[i] = arr[i]%42;
			n = arr[i];
			arr1[n] += 1;
		}
		sc.close();
		int cnt = 0;
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]!=0) {
				cnt++;
			}
		}
		System.out.println(cnt);
		*/
		
		HashSet<Integer> hs = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		int cnt=0,input=0;
		for(int i=0;i<10;i++) {
			hs.add(sc.nextInt()%42);
		}
		System.out.println(hs.size());
	}
}
