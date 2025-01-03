import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine(), " ");
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int chess[] = {1, 1, 2, 2, 2, 8}; //기존 체스판 세트 개수
		int dong[] = new int[6]; //동혁이가 찾은 체스 개수
		
		//동혁이가 찾은 체스 개수 입력
		for (int i=0; i<6; i++) {
			dong[i] = Integer.parseInt(str.nextToken());
		}//for
		
		//올바르 세트 구하기
		for (int i=0; i<6; i++) {
			if (chess[i] != dong[i]) {
				dong[i] = chess[i] - dong[i];
				bw.write(dong[i] + " ");
			} else if (chess[i] == dong[i]) {
				dong[i] = 0;
				bw.write(dong[i] + " ");
			}//if
		}//for

		br.close();
		bw.flush();
		bw.close();
		
	}// main

}// class