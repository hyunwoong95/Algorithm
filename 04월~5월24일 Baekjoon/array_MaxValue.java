package Algorithm;


import java.util.Scanner;

public class array_MaxValue {
	public static void main(String[] args) {
		
		int[] arr = {0,0,0,0,0,0,0,0,0};
		int max = 0;
		int index = 1;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<9;i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		max = arr[0];
		for(int i=1;i<9;i++) {
			if(arr[i]>max) {
				max = arr[i];
				index = i+1;
			}
		}
		System.out.println(max+"\n"+index);
	}

}


