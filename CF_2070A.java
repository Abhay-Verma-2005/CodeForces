import java.util.*;

public class CF_2070A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int c=0;
            int v=n/15;
            if(n%15==0){
                c=1;
            }
            else if(n%15==1){
                c=2;
            }
            else{
                c=3;
            }
            System.out.println(v*3+c);
        } 
    }
}
