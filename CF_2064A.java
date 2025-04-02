import java.util.*;

public class CF_2064A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int len=scanner.nextInt();
            String str=scanner.next();
            
            int c=1;
            char[] arr = str.toCharArray();
            for(int i=1;i<len;i++){
                if (str.charAt(i) != str.charAt(i - 1)) {
                    c++;
                }
            }
            if(str.charAt(0)=='0'){
                c--;
            }
            System.out.println(c);
        }
    }
}
