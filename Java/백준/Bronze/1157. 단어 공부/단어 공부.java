import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String word = scan.next().toUpperCase();

		int[] count = new int[26]; //알파벳 수만큼 배열 생성

		/*
		 	아스키코드 A = 65
		 	ex) word = "BCD"
		 		word.charAt(0 ~ 2) -> 66,67,68
		 	입력한 단어 하나씩 추출하여 뺀 값을 count 해당 배열에 ++ 
		 */
		for (int i=0; i<word.length(); i++) {
			int letter = word.charAt(i) - 'A';
			count[letter]++;
		}//for
		
		int max = 0;
		char output = '?';
		
		/*
			count 배열만큼 돌면서 가장 큰 값 구하기
			-> 가장 큰 값 char변환해서 출력
			max값과 같은 값이 있다면, ?출력 
		*/
		for (int i=0; i<count.length; i++) {
			if (count[i] > max) {
				max = count[i];
				output = (char)(i+'A');
			} else if (count[i] == max) {
				output = '?';
			}//if
		}//for

		System.out.println(output);
		
	}// main

}// class