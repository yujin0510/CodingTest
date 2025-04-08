import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//입력의 크기 n(1 ≤ n ≤ 500,000)
		//n*n*n일 경우 int는 overflow될 수 있어 long으로 
		long n = Long.parseLong(br.readLine());
		
		System.out.println(n*n*n);
		System.out.println(3);
		
	}//main

}// class