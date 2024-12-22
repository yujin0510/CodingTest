import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int number[] = new int[N];
		int temp = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		//N개 만큼 정수 입력
		for (int i=0; i<number.length; i++) {
			number[i] = Integer.parseInt(st.nextToken());
		}//for
		
		//오름차순으로 정렬하기
		Arrays.sort(number);
		
		System.out.print(number[0] + " " + number[number.length-1]);
		
	}// main

}// class
