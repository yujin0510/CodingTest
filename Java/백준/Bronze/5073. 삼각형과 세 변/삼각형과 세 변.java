import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] abc = new int[3];
		
		while(true) {
			StringTokenizer str = new StringTokenizer(br.readLine(), " ");
			abc[0] = Integer.parseInt(str.nextToken());
			abc[1] = Integer.parseInt(str.nextToken());
			abc[2] = Integer.parseInt(str.nextToken());
			
			if (abc[0] == 0 && abc[1] == 0 && abc[2] == 0) {
				break;
			}//0 0 0일 경우 반복문 중단
			
			//정렬작업
			Arrays.sort(abc);
			
			if (abc[2] >= abc[0]+abc[1]) {
				System.out.println("Invalid");
			} else if (abc[0] == abc[1] && abc[1] == abc[2]) {
				System.out.println("Equilateral");
			} else if (abc[0] == abc[1] || abc[0] == abc[2] || abc[1] == abc[2]) {
				System.out.println("Isosceles");
			} else {
				System.out.println("Scalene");
			}//if
			
		}//while
		
		br.close();
		
	}// main

}// class