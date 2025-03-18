import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int[][] arrOne = new int [n][m];
		int[][] arrtwo = new int [n][m];
		
		//arrOne에 값넣기
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				arrOne[i][j] = scan.nextInt();
			}//for-j
		}//for-i
		
		//arrtwo에 값넣기
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				arrtwo[i][j] = scan.nextInt();
			}//for-j
		}//for-i
		
		//합
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.print(arrOne[i][j] + arrtwo[i][j] + " ");
				if(j == m-1) {
					System.out.println();
				}//if
			}//for-j
		}//for-i
		
	}// main

}// class