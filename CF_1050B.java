import java.util.*;

public class CF_1050B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt(); 
            int m = sc.nextInt(); 
            int x = sc.nextInt(); 
            int y = sc.nextInt(); 
            int[] b = new int[n];
            int[] c = new int[m];
            for(int i=0;i<n;i++){
              b[i]=sc.nextInt();  
            } 
            for(int i=0;i<m;i++){
                c[i]=sc.nextInt();
            }
            System.out.println(n+m);
        }
    }
}
