import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int count = scan.nextInt();	//테스트 케이스의 개수 입력
		String quiz[] = new String[count];

		//케이스 개수만큼 배열에 OX퀴즈 결과 담기
		for (int i = 0; i < quiz.length; i++) {
			quiz[i] = scan.next();
		}//for-i
		
		//OX퀴즈 결과에 따른 점수 계산
		for (int i=0; i<quiz.length; i++) { 
			 
			int correct = 0; //O 연속횟수
			int sum = 0; //누적 합
		 
			for (int j=0; j<quiz[i].length(); j++) {
					 
				if (quiz[i].charAt(j) == 'O') {
					correct++;
				} else { 
					correct = 0; 
				}//if
					 
				sum += correct;
				 
			}//for-j
			 
			System.out.println(sum); 
		 
		}//for-i

	}// main

}// class
