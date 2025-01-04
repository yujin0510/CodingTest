import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = br.readLine(); //단어 입력
		char letter[] = new char[word.length()];
		
		//입력한 단어 한글자씩 쪼개기
		for (int i=0; i<word.length(); i++) {
			letter[i] = word.charAt(i);
		}//for

		//비교해서 팰린드롬인지 확인
		for (int i=0; i<word.length()/2; i++) {
			if (letter[i] != letter[(word.length()-1)-i]) {
				System.out.println(0);
				return; //비교해서 다를경우 바로 0출력 후 return
			}//if
		}//for

		System.out.println(1); //같으면 1 출력
		
	}// main

}// class