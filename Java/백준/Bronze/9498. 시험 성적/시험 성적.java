import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int score = scan.nextInt();
        
        if(90 <= score) {
            System.out.print("A");
        } else if(80 <= score) {
            System.out.print("B");
        } else if(70 <= score) {
            System.out.print("C");
        } else if(60 <= score) {
            System.out.print("D");
        } else {
            System.out.print("F");
        }
    }
}