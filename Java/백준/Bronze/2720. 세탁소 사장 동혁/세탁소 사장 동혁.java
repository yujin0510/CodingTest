import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		int quarter = 25;
		int dime = 10;
		int nickel = 5;
		int penny = 1;
		
		for (int i=0; i<t; i++) {
			int money = scan.nextInt();
			
			System.out.print(money/quarter + " ");
			money = money % quarter;
			
			System.out.print(money/dime + " ");
			money = money % dime;
			
			System.out.print(money/nickel + " ");
			money = money % nickel;
			
			System.out.println(money/penny);
			
		}//for
		
		scan.close();
		
	}// main

}// class