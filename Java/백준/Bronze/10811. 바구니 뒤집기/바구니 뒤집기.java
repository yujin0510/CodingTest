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
		StringTokenizer str = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(str.nextToken());
		int[] num = new int[N];
		int M = Integer.parseInt(str.nextToken()); 
		
		int I = 0;
		int J = 0;
		int temp = 0;
		
		//번호순대로 바구니
		for (int i=0; i<N; i++) {
			num[i] = i+1;
		}//for-i
		
		//역순 처리
		for (int i=0; i<M; i++) {
			str = new StringTokenizer(br.readLine());
			I = Integer.parseInt(str.nextToken());
			J = Integer.parseInt(str.nextToken());
			int jIndex = J-1;

			for (int j=I-1; j<=jIndex; j++) {
				int K = jIndex--;
				temp = num[j];
				num[j] = num[K];
				num[K] = temp;
			}//for-j
		}//for-i
		
		for (int index:num) {
			bw.write(index + " ");
		}//for
		
		br.close();
		bw.flush();
		bw.close();
		
	}// main

}// class