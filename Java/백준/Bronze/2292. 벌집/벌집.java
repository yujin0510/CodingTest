import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt(); //방 입력
		int count = 1;
		int range = 2;
		
		if(N == 1) {
			System.out.println(N);//1번 일 경우 그대로 출력
		} else {
			while(range <= N) {
				range = range + (count * 6); //벌집갯수 
				count++;
			}//while
			System.out.println(count); //지나는 방 개수 출력
		}//if
		
	}// main

}// class