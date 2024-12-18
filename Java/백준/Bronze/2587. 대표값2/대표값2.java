import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		
		int number[] = new int[5];
		int sum = 0;
		
		//수 입력
		for (int i=0; i<number.length; i++) {
		
			number[i] = scan.nextInt();
			sum += number[i];
		
		}//for
		
		//수 정렬
		/*
		for (int i=0; i<number.length-1; i++) {
			for (int j=i+1; j<number.length; j++) {
				if (number[i] >= number[j]) {
					int temp = number[j];
					number[j] = number[i];
					number[i] = temp;
				}//if
			}//for-j
		}//for-i
		*/
		
		//Arrays sort사용하여 수 정렬
		Arrays.sort(number);
		
		//평균
		int avg = sum/number.length;
		
		System.out.println(avg);
		System.out.println(number[2]);
		
		
	}//main

}//class
