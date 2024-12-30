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
		
		int N = Integer.parseInt(str.nextToken());//N번 바구니
		int[] st = new int[N];
		int M = Integer.parseInt(str.nextToken());//M개의 줄
		
		int i = 0; 
		int j = 0;
		int k = 0;
		
		//바구니에 들어있는 공 구하기
		for (int g=0; g<M; g++) {
			String[] ball = br.readLine().split(" ");
			i = Integer.parseInt(ball[0]);
			j = Integer.parseInt(ball[1]);
			k = Integer.parseInt(ball[2]);
			
			for (int h=i-1; h<j; h++) {
				st[h] = k;
			}//for-h
		}//for-g

		for(int g=0; g<st.length; g++) {
			bw.write(st[g] + " ");
		}//for-g
		
		br.close();
		bw.flush();
		bw.close();
		
	}// main

}// class