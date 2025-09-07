import java.util.*;

public class CF_2137A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
        int k = sc.nextInt();
        int n = sc.nextInt();
        int ans=n;
        for(int i=0;i<k;i++){
            ans=2*ans;
        }
        System.out.println(ans);
    }
    }
}
