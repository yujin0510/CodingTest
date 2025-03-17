import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		for (int i=0; i<2*N-1; i+=2) {

			for (int j=2*N-2; j>i; j-=2) {
				System.out.print(" ");
			}//for-j
						
			for (int k=0; k<=i; k++) {
				System.out.print("*");
				
			}//for-k
	
			System.out.println();
			
		}//for-i

		for (int i=1; i<2*N-1; i+=2) {
			
			for (int j=0; j<=i; j+=2) {
				System.out.print(" ");
			}//for-j
						
			for (int k=2*N-2; k>i; k--) {
				System.out.print("*");
				
			}//for-k
	
			System.out.println();
			
		}//for-i
		
	}// main

}// class