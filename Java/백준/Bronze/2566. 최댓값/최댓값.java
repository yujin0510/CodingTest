import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		
		int max = 0;
		int num[][] = new int[9][9];
		int row = 1;	//행
		int column = 1;	//열
		
		//2차원 배열 정수 입력
		for (int i=0; i<9; i++) {
			for (int j=0; j<9; j++) {
				num[i][j] = scan.nextInt();
			}//for-j
		}//for-i
		
		max = num[0][0];
		
		//최댓값 구하기
		for (int i=0; i<9; i++) {
			for (int j=0; j<9; j++) {
				if (num[i][j]>max) {
					max = num[i][j];
					row = i+1;
					column = j+1;
				}//if
			}//for-j
		}//for-i
		
		//출력
		System.out.println(max);
		System.out.println(row + " " + column);
		
	}// main

}// class