import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int first = scan.nextInt();
        int second = scan.nextInt();
        
        int one = (second%100%10)*first;
        int ten = (second/10%10)*first;
        int hundred = (second/100)*first;
        
        System.out.println(one);
        System.out.println(ten);
        System.out.println(hundred);
        System.out.println(first*second);
     
    }
}