import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt(); //창문의 개수와 사람의 수 입력
		int count = 0; //창문개수 카운트
		
		//창문 개수 구하기
		for (int i=1; i*i<=N; i++) {
			count++;
		}
		
		System.out.println(count);
		
	}// main

}// class
