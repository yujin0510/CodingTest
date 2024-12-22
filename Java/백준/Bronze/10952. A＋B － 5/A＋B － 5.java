import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] num = new String[2];
		
		while (true) {
			
			//숫자 입력
			num = br.readLine().split(" ");
			int A = Integer.parseInt(num[0]);
			int B = Integer.parseInt(num[1]);
			
			//A와 B가 0이면 중단
			if (A==0 && B==0) {
				break;
			}//if
				
			bw.write(A+B + "\n");
			
		}//while

		br.close();
		
		bw.flush();
		bw.close();
		
	}// main

}// class
