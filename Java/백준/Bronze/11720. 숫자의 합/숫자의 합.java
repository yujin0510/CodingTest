import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine()); //숫자 개수
		String[] word = br.readLine().split(""); //문자열로 한글자씩 배열 담기
		int total = 0;
		
		for (int i=0; i<count; i++) {
			total += Integer.parseInt(word[i]); //형변환하여 total에 누적
		}

		System.out.println(total);
		
	}

}
	
