import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = 1;
		int B = 1;
		
		while(true) {
			StringTokenizer str = new StringTokenizer(br.readLine(), " ");
			A = Integer.parseInt(str.nextToken());
			B = Integer.parseInt(str.nextToken());
			
			if (A == 0 && B == 0) {
				break;
			}//A, B가 0일 떄 중단
			
			if (B % A == 0) {
				System.out.println("factor");
			} else if(A % B == 0) {
				System.out.println("multiple");
			} else {
				System.out.println("neither");
			}//if
		}//while 
		
	}// main

}// class