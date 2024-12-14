import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int number = scan.nextInt();
        
        for(int dan=1; dan<10; dan++) {
            System.out.println(number + " * " + dan + " = " + number*dan);
        }
    }
}