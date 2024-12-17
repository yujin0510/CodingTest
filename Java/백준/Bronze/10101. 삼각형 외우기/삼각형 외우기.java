import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//2번 방식 Scanner사용
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int degree = a + b + c;
		
		if (a == 60 && b == 60 && c == 60) {	//세 각이 모두 60일 때
			System.out.println("Equilateral");
		} else if (degree == 180 && (a==b || a==c || b==c)) {	//각도 합이 180이면서, 두 각이 같을 때
			System.out.println("Isosceles");
		} else if (degree == 180 && !(a==b || a==c || b==c)) {	//각도 합이 180이면서, 세 각이 다 다를 때
			System.out.println("Scalene");
		} else if (degree != 180) {	//각도 합이 180이 아닐 때
			System.out.println("Error");
		}//if
	
	}//main

}//class
