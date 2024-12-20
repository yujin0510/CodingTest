import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		
		int number = scan.nextInt();
		String name = "";
		String log = "";
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		
		for (int i=0; i<number; i++) {
			name = scan.next();	//이름 입력
			log = scan.next();	//출입 입력
			
			if (map.containsKey(name)) {
				map.remove(name);	//이름이 이미 있는 경우 삭제
			} else {
				map.put(name, log);	//없으면 담기
			} //if

		} //for
		
		//Hashmap의 key를 ArraList에 담기
		ArrayList<String> list = new ArrayList<String>(map.keySet());
		
		//정렬시키기
		Collections.sort(list, Collections.reverseOrder());
		
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		} //for
		
	}//main

}//class
