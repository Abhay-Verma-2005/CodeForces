import java.util.*;
public class CF_1977A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            int n=sc.nextInt();
            int m=sc.nextInt();

            if(m<=n && m%2==n%2){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            
        }
        
    }
    
}   
