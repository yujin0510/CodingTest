import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int M = scan.nextInt();
		int N = scan.nextInt();
		int number[] = new int[N-M+1];
		int sum = 0;
		int count = 0;
		int min = 0;
		
		//소수 구하기
		for (int i=0; i<=N-M; i++) {
			number[i] = M+i;
			
			for (int j=2; j<=number[i]; j++) {
				if (j == number[i]) {
					sum += number[i];
					count++;
					
					//최솟값 구하기 -> 소수가 하나라도 생기면 그 값이 최솟값(순차적으로 소수 구하고 있기 때문, 자동 오름차순)
					if (count == 1) {
						min = number[i];
					}
				}//if
				
				if (number[i] % j == 0) {
					break;
				}//if
			}//for-j
			
		}//for-i
		
		//소수가 하나라도 있으면 출력
		if (count != 0) {
			System.out.println(sum);
			System.out.println(min);
		} else { //없으면 -1출력
			System.out.println(-1);
		}//ㅑㄹ
		
		
	}// main

}// class