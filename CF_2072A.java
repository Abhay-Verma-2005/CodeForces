import java.util.*;

public class CF_2072A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k= sc.nextInt();
            int p=sc.nextInt();
            int minRange=n*p*-1;
            int maxRange=n*p;
            int ans=0;
            if(k==0){
                System.out.println(0);
            }
            else if(k>maxRange || k<minRange){
                System.out.println(-1);
            }
            else{
                if(k%p==0){
                    ans=Math.abs(k/p);
                }
                else{
                    ans=Math.abs(k/p)+1;
                }
                System.out.println(ans);
            }
        }
        sc.close();
    }
}
