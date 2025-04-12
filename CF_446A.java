import java.util.*;

public class CF_446A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ride_b=b/m;
        int ans=0;
        if(ride_b<a){
            int r=n%m;
            int q=n/m;
            if(a*r >b){
                ans = q*b+b;
            }
            else{
                ans = q*b +r*a;
            }
            

        }
        else{
            ans=a*n;
        }
        System.out.println(ans);
    }
}
