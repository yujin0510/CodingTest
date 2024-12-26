import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//테스트 케이스 개수 입력
		int T = Integer.parseInt(br.readLine());
		
		for (int i=0; i<T; i++) {
			String[] word = br.readLine().split(" ");
		
			int R = Integer.parseInt(word[0]);//반복 횟수
			String S = word[1];//문자열
			
			//반복횟수 만큼 S출력
			for (int j=0; j<S.length(); j++) {
				for (int k=0; k<R; k++) {
					System.out.print(S.charAt(j));
				}//for-k
			}//for-j
			
			System.out.println();//엔터
			
		}//for-i
		
		br.close();

	}// main

}// class