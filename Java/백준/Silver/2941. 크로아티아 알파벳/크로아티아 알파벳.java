import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		String word = scan.nextLine();
		
		//크로아티아 알파벳이 포함되어있다면 "*"로 변환 -> word의 길이가 그로아티아 알파벳 개수
		for (int i=0; i<croatia.length; i++) {
			if (word.contains(croatia[i])) {
				word = word.replace(croatia[i], "*");
			}//if
		}//for
		
		System.out.println(word.length());
		scan.close();
		
	}// main

}// class