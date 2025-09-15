import java.util.*;

public class CF_1050A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int x = sc.nextInt();
            int n1 =sc.nextInt();
            if(n1%2==0){
                System.out.println(0);
            }
            else{
                System.out.println(x);
            }
        }
    }
}
