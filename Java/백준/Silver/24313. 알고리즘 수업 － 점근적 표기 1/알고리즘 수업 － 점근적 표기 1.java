import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//fn을 나타내는 정수 a1, a2
		int a1 = Integer.parseInt(st.nextToken());
		int a0 = Integer.parseInt(st.nextToken());
		
		int c = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		int fn = a1 * n + a0;
		int gn = n; //O(n) = O(gn) > n = gn
		
		if (fn <= c * gn && a1 <= c) { //a1이 음수일 때 성립되기 때문에 a1<=c 추가
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		
	}//main

}// class