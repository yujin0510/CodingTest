import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken()); //정수 N개
		int X = Integer.parseInt(st.nextToken()); //정수 X
		
		//StringTokenizer: 공백이 있으면 뒤에 문자열이 공백 자리로
		st = new StringTokenizer(br.readLine(), " "); 
		
		//숫자 입력, X보다 작은 숫자 출력
		for (int i=0; i<N; i++) {
			int number = Integer.parseInt(st.nextToken());
			
			if(number < X) {
				System.out.print(number + " ");
			}//if

		}//for
		
	}// main

}// class
