import java.util.*;
public class CF_2044C{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int m = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();  
        System.out.println(hard(m,a,b,c));

        }
    }

    public static int hard(int m , int a, int b, int c) {
        int ans = 0;
        int r1=Math.min(m,a);
        int r2=Math.min(m,b);
        if((2*m)-r1-r2>0){
            ans = r1+r2+(Math.min((2*m-r1-r2),c));
        }
        else{
           ans = r1+r2;
        }
        return ans;
    }
}
