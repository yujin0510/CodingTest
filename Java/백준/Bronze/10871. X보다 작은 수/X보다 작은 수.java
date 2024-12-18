import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();	//정수 N개
		int X = scan.nextInt();	//정수 X
		int A[] = new int[N];	//수열 A
		
		for (int i=0; i<N; i++) {
			A[i] = scan.nextInt();	//정수N만큼 정수 입력
		}//for
		
		// 정수 X보다 작은 정수 출력
		for (int i=0; i<A.length; i++) {
			if (A[i] < X) {
				System.out.print(A[i] + " ");
			}//if
		}//for
	
	}//main

}//class
