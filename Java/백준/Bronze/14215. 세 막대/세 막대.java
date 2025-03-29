import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int rod[] = {a,b,c};
		Arrays.sort(rod);
		
		if(rod[0] + rod[1] > rod[2]) {
			System.out.println(a + b + c);
		} else {
			System.out.println((rod[0] + rod[1]) *2 -1);
		}//if
		
	}// main

}// class