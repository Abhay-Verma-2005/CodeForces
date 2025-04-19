import java.util.Scanner;
public class CF_2093A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        while (t-->0) {
            int k=sc.nextInt();
            if (k%2==1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
