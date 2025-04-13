import java.util.*;

public class CF_2065B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            String s = scanner.next();
            int a = 0;
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == s.charAt(i - 1)) {
                    a=1;
                    break;
                }
            }
            if(a==0){
                System.out.println(s.length());
            }
            else{
                System.out.println(a);
            }
        }
    }
}