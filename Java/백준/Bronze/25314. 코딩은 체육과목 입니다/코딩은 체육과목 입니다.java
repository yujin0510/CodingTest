import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int N = Integer.parseInt(str);
		
		for (int i=1; i<=N/4; i++) {
			System.out.print("long");
			System.out.print(" ");
		}
		
		System.out.print("int");
		
	}
	
}
