import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int number = 0;
		int count = 0;
		
		//소수 구하기
		for (int i=0; i<N; i++) {
			number = scan.nextInt();
			
			for (int j=2; j<=number; j++) {
				if (j == number) {
					count++;
				}//if
				
				if (number % j == 0) {
					break;
				}//if
			}//for-j
		}//for-i
		
		System.out.println(count);
		
		
	}// main

}// class