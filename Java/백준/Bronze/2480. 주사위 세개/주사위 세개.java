import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] dice = new int[3]; //주사위 눈 담기
		
		for (int i=0; i<dice.length; i++) {
			dice[i] = scan.nextInt();
		}//for
		
		//수 정렬하기 -> 가장 큰수 편하게 가져오기 위함.
		for (int i=0; i<dice.length-1; i++) {
			for (int j=i+1; j<dice.length; j++) {
				
				if (dice[i] > dice[j]) {
					int temp = dice[j];
					dice[j] = dice[i];
					dice[i] = temp;
					
				}//if
			}//for-j
		}//for-i
		
		//출력
		if (dice[0] != dice[1] && dice[1] != dice[2] && dice[0] != dice[2]) {
			System.out.println(100*dice[2]); //모두 다 다른 눈일 경우
		} else {
			
			if (dice[0] == dice[1] && dice[1] == dice[2]) { //모두 같은 눈일 경우
				System.out.println(10000+dice[1]*1000);
				
			//같은 눈이 2개만 나오는 경우
			} else if (dice[0] == dice[1]) {
				System.out.println(1000+dice[0]*100);
			} else if (dice[0] == dice[2]) {
				System.out.println(1000+dice[0]*100);
			} else {
				System.out.println(1000+dice[1]*100);
			}
			
		}//if
		
	}// main

}// class
