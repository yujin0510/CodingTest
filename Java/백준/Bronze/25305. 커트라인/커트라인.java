import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int k = scan.nextInt();
		
		int score[] = new int[N];
		
		for (int i=0; i<N; i++) {
			score[i] = scan.nextInt();
		}//for
		
		Arrays.sort(score);
		
		System.out.println(score[N-k]);
		
	}//main

}// class