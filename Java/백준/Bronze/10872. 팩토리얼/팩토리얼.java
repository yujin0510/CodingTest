import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		
		int number = scan.nextInt();
		int factory = 1;
		
		while(number != 0) {
			factory = factory * number;
			number--;
		}
		
		System.out.println(factory);
		
	}//main

}//class
