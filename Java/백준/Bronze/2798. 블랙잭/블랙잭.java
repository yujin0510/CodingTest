import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] number = new int[N];
		
		int sum = 0;
		int max = 0;
		
		//N개만큼 숫자 입력
		for (int i=0; i<N; i++) {
			number[i] = scan.nextInt();
		}

		for (int i=0; i<N-2; i++) {
			for (int j=i+1; j<N-1; j++) {
				for (int k=j+1; k<N; k++) {
					
					sum = number[i] + number[j] + number[k]; //합계
					if (sum <= M) { //M을 넘지 않게
						max = Math.max(max, sum); //제일 가까운 수 찾기
					}//if
					
				}//for-k
			}//for-j
		}//for-i
        
        System.out.println(max);
		
	}//main

}// class