import java.util.*;

public class CF_2008A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            if(a%2==0 && b%2==0){
                System.out.println("YES");
            }else if(a%2==0 && b%2==1 && a!=0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}