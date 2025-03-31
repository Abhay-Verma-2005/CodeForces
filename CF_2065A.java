import java.util.*;

public class CF_2065A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            String s = scanner.next();
            int n = s.length();
            if(n<2){
                System.out.println(s);
            }
            else{
                if(s.charAt(n-2)=='u' && s.charAt(n-1)=='s'){
                    System.out.println(s.substring(0,n-2)+"i");
                }
            }
        }
    }
}
