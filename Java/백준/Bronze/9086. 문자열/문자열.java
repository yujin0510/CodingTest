import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine()); //테스트 케이스 개수
		String word = "";
		
		for (int i=0; i<count; i++) {
			word = br.readLine();
			bw.write(word.charAt(0) + word.substring(word.length()-1, word.length()) + "\n"); //문자 첫글자와 마지막 글자 추출
		}
			br.close();
			bw.flush(); // 남아있는 데이터 전부 출력
			bw.close();
			
	}

}
	
