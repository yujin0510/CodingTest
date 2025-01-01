import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine(), " ");
		
		//A, B 입력한 수 뒤집기
		int A = Integer.parseInt(new StringBuilder(str.nextToken()).reverse().toString());
		int B = Integer.parseInt(new StringBuilder(str.nextToken()).reverse().toString());
		
		//출력
		if (A > B) {
			System.out.println(A);
		} else {
			System.out.println(B);
		}//if
		
	}// main

}// class