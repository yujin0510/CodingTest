import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		
		int A = 0;
		int B = 0;
		
		//hasNextInt(): 입력값이 정수일 경우 true, 정수가 아닌 값을 입력할 경우 false반환하며 반복문 종류
		while (scan.hasNextInt()) {
			A = scan.nextInt();
			B = scan.nextInt();
			System.out.println(A+B);
		}
		
		scan.close();
		
	}// main

}// class
