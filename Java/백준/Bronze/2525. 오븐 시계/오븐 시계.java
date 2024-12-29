import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();//현재 시각 시 A
		int B = scan.nextInt();//현재 시각 분 B
		int C = scan.nextInt();//요리하는데 필요한 시간 C
		
		B = A * 60 + B;
		B = B + C;
		
		A = (B/60)%24;
		int minute = B % 60;
		
		System.out.println(A + " " + minute);
		
	}// main

}// class