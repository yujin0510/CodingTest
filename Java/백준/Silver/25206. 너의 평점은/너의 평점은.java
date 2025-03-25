import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashMap<String, Double> subjectAVG = new HashMap<String, Double>(); //등급별 점수
		double sum = 0;
		double div = 0;
		
		subjectAVG.put("A+", 4.5);
		subjectAVG.put("A0", 4.0);
		subjectAVG.put("B+", 3.5);
		subjectAVG.put("B0", 3.0);
		subjectAVG.put("C+", 2.5);
		subjectAVG.put("C0", 2.0);
		subjectAVG.put("D+", 1.5);
		subjectAVG.put("D0", 1.0);
		subjectAVG.put("F", 0.0);
		
		for (int i=0; i<20; i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			String subject = str.nextToken();
			double score = Double.parseDouble(str.nextToken());
			String grade = str.nextToken();
			
			if (grade.equals("P")) {
				continue;
			}//if
			
			sum += (subjectAVG.get(grade) * score);
			div += score;
			
		}//for
		
		System.out.print(sum / div);
		
	}// main

}// class