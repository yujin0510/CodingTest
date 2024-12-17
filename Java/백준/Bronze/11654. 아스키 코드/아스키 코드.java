import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//1번 방식 BufferedReader사용
		/*
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 * 
		 * int n = (int)br.readLine().charAt(0); //문자 -> 숫자 형변환
		 * 
		 * System.out.println(n);
		 */
		
		//2번 방식 Scanner사용
		Scanner scan = new Scanner(System.in);
		
		int s = (int)scan.nextLine().charAt(0);	//문자 -> 숫자 형변환
		
		System.out.println(s);
		
	}//main

}//class
