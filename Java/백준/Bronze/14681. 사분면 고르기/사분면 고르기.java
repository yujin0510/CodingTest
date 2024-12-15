import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int x = scan.nextInt();
        int y = scan.nextInt();
        
        if ( -1000<=x && x<=1000 && x!=0 && -1000<=y && y<=1000 && y!=0) {
			
            if(x>0 && y>0) {
				System.out.println("1");
			} else if(x<0 && y>0) {
				System.out.println("2");
			} else if(x<0 && y<0) {
				System.out.println("3");
			} else if(x>0 && y<0) {
				System.out.println("4");
			}
            
        } else {
			System.out.println("\"-1000<=x(x!=0)<=1000, -1000<=y(y!=0)<=1000\" 위 조건에 맞춰 다시 입력해주세요.");
		}
    }
}