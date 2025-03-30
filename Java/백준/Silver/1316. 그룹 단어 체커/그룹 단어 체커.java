import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); //단어 개수 입력
		int count = n;
		
		for (int i=0; i<n; i++) {
			String input = scan.next(); //개수만큼 단어 입력
			boolean[] check = new boolean[26];
			
			for (int j=0; j<input.length(); j++) {
				//문자가 처음 나오는 경우(false)
				if (check[input.charAt(j) - 'a' ] == false) {
					check[input.charAt(j) - 'a' ] = true; //true로 변환
					
				//문자가 이미 있는 경우
				} else if (j > 0 && input.charAt(j) != input.charAt(j - 1)) {
					count--;
					break;
				}//if
			}//for
		}//for
		
		System.out.println(count);
		
	}// main

}// class