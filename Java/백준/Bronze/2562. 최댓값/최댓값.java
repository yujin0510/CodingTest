import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		
		int N[] = new int[9]; //9개의 자연수
		int max = 0; //최댓값
		int count = 0; //몇번째 위치
		
		for (int i=0; i<N.length; i++) {
			N[i] = scan.nextInt(); //9개의 자연수 입력
			
			if (N[i] > max) { //최댓값 구하기
				max = N[i];
				count=i+1;
			}//if
			
		}//for
		
		System.out.println(max); //최댓값
		System.out.println(count); //몇번째 위치
	
	}//main

}//class
