import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		
		long A = scan.nextInt(); //낮에 올라갈 수 있는 미터
		long B = scan.nextInt(); //밤에 내려가는 미터
		long V = scan.nextInt(); //총 나무 미터
		
		long day = A - B; //하루 동안 가는 거리
		long goal = V - B; //최종 목적지
		
		//계산
		if ( goal % day != 0) {
			System.out.println(goal / day + 1);
		} else {
			System.out.println(goal / day);
		}//if
		
	}// main

}// class