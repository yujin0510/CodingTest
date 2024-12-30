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
		
		int i = 0;//i번 바구니
		int j = 0;//j번 바구니
		int temp = 0;//담아둘 바구니
		
		//처음에 바구니에 적혀있는 번호와 같은 번호가 적힌 공
		for (int g=0; g<st.length; g++) {
			st[g] = g+1;
		}//for-g
		
		//바구니 안에 들어있는 공 구하기
		for (int h=0; h<M; h++) {
			str = new StringTokenizer(br.readLine());
			i = Integer.parseInt(str.nextToken());
			j = Integer.parseInt(str.nextToken());

			//공 바꾸기 작업
			temp = st[i-1];
			st[i-1] = st[j-1];
			st[j-1] = temp;
		}//for-h
		
		for (int g=0; g<st.length; g++) {
			bw.write(st[g] + " ");
		}//for-g
		
		br.close();
		bw.flush();
		bw.close();
		
	}// main

}// class