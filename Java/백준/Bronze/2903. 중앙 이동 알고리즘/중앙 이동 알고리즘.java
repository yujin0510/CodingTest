import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		//Math.pow()로 거듭제곱
		int result = (int) Math.pow(Math.pow(2, N)+1, 2);
		
		System.out.println(result);
		
	}// main

}// class