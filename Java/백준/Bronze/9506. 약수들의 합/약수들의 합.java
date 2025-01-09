import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			int p = scan.nextInt();
			
			if (p == -1) {
				break;
			}//-1이면 중단

			int divisor[] = new int[p];
			int sum = 0; 

			for (int i=1; i<p; i++) {
				if (p % i == 0) {
					divisor[i-1] = i;
					sum += i;
				}
			}//약수 구하기, 약수 아닌 값은 0으로
			
			if (sum == p) {
				System.out.print(p + " = 1");
				for (int i=1; i<p; i++) {
					if (divisor[i] != 0) {
						System.out.print(" + " + divisor[i]);
					}//if
				}//for
			} else {
				System.out.print(p + " is NOT perfect.");
			}//if

			System.out.println();
			
		}//while
		
		scan.close();
		
	}// main

}// class