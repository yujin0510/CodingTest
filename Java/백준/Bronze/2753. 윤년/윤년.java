import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input = br.readLine();
		int result = Integer.parseInt(input);
		
		if (result%4==0 && (result%100!=0 || result%400==0)) {
			bw.write("1");
			bw.close();
			br.close();
		} else {
			bw.write("0");
			bw.close();
			br.close();
		}
	}
	
}