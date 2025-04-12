import java.util.*;

public class CF_2048A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            String s = scanner.next(); 
            int num=0;
            for(int i = 0; i < s.length(); i++) {
                num = num*10 + (s.charAt(i) - '0');
            }
            if(num%33==0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
