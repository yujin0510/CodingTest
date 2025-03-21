import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		
		char[][] letter = new char[5][15];
		String str = "";
		int max = 0;
		
		//입력
		for (int i=0; i<5; i++) {
			str = scan.next();
			
			if(str.length() > max) {
				max = str.length();
			}//if
			
			for (int j=0; j<str.length(); j++) {
				letter[i][j] = str.charAt(j);
			}//for-j
		}//for-i
		
		//출력
		for (int i=0; i<max; i++) {
			for (int j=0; j<5; j++) {
				//내부가 공백이거나 null일 경우 continue
				if (letter[j][i] == '\0') {
					continue;
				}//if
				System.out.print(letter[j][i]);
			}//for-j
		}//for-i
		
	}// main

}// class