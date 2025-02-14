import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str;
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		HashMap<Integer, Integer> mine = new HashMap<>();
		str = new StringTokenizer(br.readLine());
		
		for (int i=0; i<n; i++) {
			mine.put(Integer.parseInt(str.nextToken()), i);
		}//상근이가 가지고 있는 숫자카드
		
		int m = Integer.parseInt(br.readLine());
		str = new StringTokenizer(br.readLine());
		
		String result[] = new String[m];
		
		for (int i=0; i<m; i++) {
			if (mine.get(Integer.parseInt(str.nextToken())) != null) {
				result[i] = "1";
			} else {
				result[i] = "0";
			}
		}//상근이가 가지고 있는 숫자크드인지 확인

		//결과 출력
		for (int i=0; i<result.length; i++) {
			System.out.print(result[i] + " ");
		}
		
	}// main

}// class