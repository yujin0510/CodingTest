import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		int student[] = new int[30];
		
		//과제 낸 학생 1로 표시
		for (int i=0; i<28; i++) {
			int number = scan.nextInt();
			student[number-1] = 1;
		}//for
		
		for (int i=0; i<student.length; i++) {
			if (student[i] != 1) {
				System.out.println(i+1);
			}//if
		}//for
		
	}// main

}// class
