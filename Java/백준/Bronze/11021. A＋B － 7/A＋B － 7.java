import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine()); //테스트 케이스의 개수
		
		for (int i=0; i<T; i++) {
			String[] str = br.readLine().split(" "); //A와 B공백
			int A = Integer.parseInt(str[0]);
			int B = Integer.parseInt(str[1]);
			
			bw.write("Case #" + (i+1) + ": " + (A+B) + "\n"); //출력
		}
		br.close();//BufferedReader 닫기

		bw.flush();//남아있는 데이터 모두 출력
		bw.close();//BufferedWriter 닫기
		
	}
	
}
