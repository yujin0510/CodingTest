import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int p = scan.nextInt();
		int q = scan.nextInt();
		List<Integer> divisor = new ArrayList<Integer>();
		
		//나머지가 0이면 p의 약수
		for (int i=1; i<=p; i++) {
			if (p % i == 0) {
				divisor.add(i);
			}//if
		}//for
		
		if (divisor.size() < q) {
			System.out.println(0);
		} else {
			System.out.println(divisor.get(q-1));
		}//if
		
		scan.close();
		
	}// main

}// class