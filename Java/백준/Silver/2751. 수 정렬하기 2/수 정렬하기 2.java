import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//정수 입력
		for (int i=0; i<N; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}//for
		
		br.close();

		//정렬하기
		Collections.sort(list);
		
		//정렬한 정수 출력하기
		for(int i:list) {
			bw.write(i + "\n");
		}//for
		
		bw.flush();
		bw.close();
		
	}// main

}// class