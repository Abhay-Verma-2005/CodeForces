import java.util.*;

public class CF_2074B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        
        for (int i = 0; i < t; i++) { 
            int n = sc.nextInt();
            int sum = 0;

            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                sum += a;
            }
            
            System.out.println(sum-(n-1));
        }
    }
}
