import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine()); //정수 개수 N
		int number[] = new int[N]; //N개 만큼의 숫자
		int count = 0; //카운트
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//N개의 정수 입력
		for (int i=0; i<number.length; i++) {
			number[i] = Integer.parseInt(st.nextToken());
		}//for
		
		//찾으려고 하는 정수v
		int v = Integer.parseInt(br.readLine());
		
		//정수v와 같은 정수 카운트
		for (int i=0; i<number.length; i++) {
			if (v == number[i]) {
				 count++;
			}//if
		}//for
		
		System.out.println(count);
		
		br.close();
		bw.flush();
		bw.close();
		
	}// main

}// class
