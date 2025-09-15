import java.util.*;

public class CF_1050C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt(); 
            int m = sc.nextInt(); 
            long x = 0; 
            long y = 0; 
            int z = 0; 
            for(int i=0;i<n;i++){
                Long rr=sc.nextLong();
                int rt=sc.nextInt();
                long d=rr-y;
                long ans=d;
                int rs=(z+rt)%2;
                int tt=(int)(d%2);
                if(rs!=tt){
                    ans--;
                }
                x+=ans;
                y=rr;
                z=rt;
            }
            System.out.println(x+(m-y));
        }
    }
}
