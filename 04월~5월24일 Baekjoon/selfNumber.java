package Algorithm;

public class selfNumber {

	public static void main(String[] args) {
		boolean[] bl = new boolean[10001];
		for(int i=1;i<10001;i++) {
			int n = selfnum(i);
			
			if(n < 10001) {
				bl[n] = true;
			}
		}
		int cnt=0;
		for(int i=1;i<10001;i++) {
			if(bl[i] != true) {
				System.out.println(i+","+ ++cnt);
			}
		}
			
	}
	
	public static int selfnum(int number) {
		int sum = number;
		
		while(number != 0) {
			sum += number%10;
			number = number/10;
		}
		return sum;
	}

}
