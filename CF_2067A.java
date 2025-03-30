import java.util.*;

public class CF_2067A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt(); 
            boolean flag = false;

            if (y == x + 1) {
                flag = true;
            }
             else if (x > y && (x + 1 - y) % 9 == 0) {
                flag = true;
            } else {
                flag = false;
            }

            if (flag) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }
    
}
