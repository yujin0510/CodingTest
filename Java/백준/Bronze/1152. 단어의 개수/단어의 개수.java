import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] sentence = br.readLine().split(" ");
		int count = 0;
		
		for (int i=0; i<sentence.length; i++) {
			if (sentence[i] != "") {
				count++;
			}//if
		}//for
		
		System.out.println(count);
		
	}// main

}// class
