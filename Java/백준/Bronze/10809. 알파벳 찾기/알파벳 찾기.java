import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		String S = scan.nextLine(); //단어S
		
		int[] letter = new int[26];
		
		for (int i=0; i<letter.length; i++) {
			letter[i] = -1;
		}//for
		
		//알파벳 위치 
		for (int  i=0; i<S.length(); i++) {
			char c = S.charAt(i);
			
			if(letter[c-97] == -1) {
				letter[c-97] = i;
			}//if
		}//for
		
		//출력
		for (int i : letter) {
			System.out.print(i + " ");
		}//for
		
	}// main

}// class