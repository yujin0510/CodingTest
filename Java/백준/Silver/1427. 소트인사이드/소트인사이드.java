import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String N = br.readLine();
		String num[] = N.split("");
		int arr[] = new int[num.length];
		
		//문자열로 담은 수 배열에 정수로 다시 담기 
		for (int i=0; i<num.length; i++) {
			arr[i] = Integer.parseInt(num[i]);
		}//for
		
		//정렬하기
		Arrays.sort(arr);
		
		//오름차순 정렬 -> 내림차순으로 바꿔서 출력
		for (int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]);
		}
		
	}// main

}// class