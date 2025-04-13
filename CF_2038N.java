import java.util.*;

public class CF_2038N {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            String s= scanner.next();
            int n = s.length();
            int a = s.charAt(0) - '0';
            int b = s.charAt(2) - '0';
            if(a>b){
                System.out.println(a+">"+b);
            }
            else if(a<b){
                System.out.println(a+"<"+b);
            }
            else{
                System.out.println(a+"="+b);
            }
        }
    }
}