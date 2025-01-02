import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String write = "";
		
		//hasNextLine() : 다음 가져올 값이 있으면 true, 없으면 false반환
		//개행문자 "\n"도 true변환 > 주의!
		while(scan.hasNextLine()) {
			write = scan.nextLine();
			System.out.println(write);
		}//while
		
	}// main

}// class