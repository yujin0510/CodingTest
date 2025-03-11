import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		
		String word = scan.next();
		
		int count = 0;
		
		for (int i=0; i<word.length(); i++) {
			
			switch(word.charAt(i)) {
			
			//기존 Switch문
			case 'A': case 'B': case 'C':
				count += 3;
				break;
				
			case 'D': case 'E': case 'F':
				count += 4;
				break;
				
			case 'G': case 'H': case 'I':
				count += 5;
				break;
				
			case 'J': case 'K': case 'L':
				count += 6;
				break;
				
			case 'M': case 'N': case 'O':
				count += 7;
				break;
				
			case 'P': case 'Q': case 'R': case 'S':
				count += 8;
				break;
				
			case 'T': case 'U': case 'V':
				count += 9;
				break;
				
			case 'W': case 'X': case 'Y': case 'Z':
				count += 10;
				break;
			
			//개선된 Switch문?
			//	화살표 case, 다중 case 사용
			/*
			case 'A', 'B', 'C' -> count += 3;
			case 'D', 'E', 'F'-> count += 4;
			case 'G', 'H', 'I' -> count += 5;
			case 'J', 'K', 'L' -> count += 6;
			case 'M', 'N', 'O' -> count += 7;
			case 'P', 'Q', 'R', 'S' -> count += 8;
			case 'T', 'U', 'V' -> count += 9;
			case 'W', 'X','Y', 'Z' -> count += 10;
			*/
			
			}//switch
			
		}//for
		
		System.out.println(count);
		
	}// main

}// class