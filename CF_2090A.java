import java.util.Scanner;

public class CF_2090A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long t = scanner.nextLong();
        
        while (t-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int a = scanner.nextInt();
            a=a%(x+y);
            if(a<x){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
                }
        }
    }
}
