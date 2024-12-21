import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int number = scan.nextInt(); //숫자 입력
		int count = 0; //0에 대한 카운트
		
		scan.close();
		
		while (number >= 5) {
			count += number/=5;
		}//while
		
		System.out.println(count);
			
	}// main

}// class
