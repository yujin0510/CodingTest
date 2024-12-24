import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		double avg[] = new double[N]; //성적 점수
		double sum = 0; //성적 합계
		
		StringTokenizer str = new StringTokenizer(br.readLine(), " ");
		
		//성적 점수 입력
		for (int i=0; i<avg.length; i++) {
			avg[i] = Double.parseDouble(str.nextToken());
		}//for

		//점수 정렬
		Arrays.sort(avg);
		
		//각 점수마다 최댓값으로 나눠 *100해서 누적합 구하기
		for (int i=0; i<avg.length; i++) {
			sum += avg[i] / avg[avg.length-1] * 100;
		}//for
		
		//평균 구하기
		System.out.println(sum/avg.length);
		
	}// main

}// class
