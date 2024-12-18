import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine()); //세로 길이 입력
		int B = Integer.parseInt(br.readLine()); //가로 길이 입력
		
		int area = A * B; //넓이 = 세로 * 가로
		
		System.out.println(area); //넓이 출력(cm2은 생략)
	
	}//main

}//class
