import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();		
		int i = 2;
		
		//몫이 1일 될때까지 while문 수행
		while(N != 1) {

			//나머지가 0일 경우 -> N/i 수행 
			//나머지가 0이 아닐 경우 i값 +1증가
			if (N % i == 0) {
				System.out.println(i);
				N /= i;
			} else {
				i++;
			}//if
			
		}//while
		
	}// main

}// class