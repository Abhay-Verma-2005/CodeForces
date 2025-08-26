import java.util.*;

public class CF_1043A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n=scanner.nextInt();
            String s1=scanner.next();
            int m=scanner.nextInt();
            String s2=scanner.next();
            String a=scanner.next();
            for(int i=0;i<m;i++){
                if(a.charAt(i)=='D'){
                    s1=s1+s2.charAt(i);
                }
                else{
                    s1=s2.charAt(i)+s1;
                }
            }
            System.out.println(s1);
        }
    }
}


