import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int number[] = new int[N];
		
		//N개 만큼 숫자 담기
		for (int i=0; i<number.length; i++) {
			number[i] = scan.nextInt();
		}
		
		//정렬 작업
		for (int i=0; i<number.length-1; i++) {
			for (int j=i+1; j<number.length; j++) {
				if (number[i] > number[j]) {
					int temp = number[j];
					number[j] = number[i];
					number[i] = temp;
				}//if
			}//for-j
		}//for-i
	
		//출력
		for (int i : number) {
			System.out.println(i);
		}
		
	}//main

}//class
