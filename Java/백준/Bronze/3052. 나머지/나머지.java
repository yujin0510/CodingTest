import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    
   public static void main(String[] args) throws IOException {
       
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       //중복값 허용하지 않는 Set사용
       Set<Integer> numSet = new HashSet<Integer>(10);
       int count = 0;
       
       //나머지 계산하기
       for (int i=0; i<10; i++) {
           numSet.add(Integer.parseInt(br.readLine()) % 42);
       }//for
       
       //서로 다른값 몇개 있는지 구하기
       for (int index:numSet) {
           count++;
       }
       
       //출력
       System.out.println(count);
   }//main
    
}//class