import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i=0; i<N; i++) {
			
			for (int k=1; k<N-i; k++) {
				System.out.print(" ");	//공백 출력
			}

			for (int j=0; j<i+1; j++) {
				System.out.print("*");	//별 출력
			}
			
			System.out.println(); //줄바꿈
		}//for문
		
	}//main

}//class
