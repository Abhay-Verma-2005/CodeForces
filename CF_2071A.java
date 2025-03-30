import java.util.*;

public class CF_2071A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            if(n%3==1){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
                }
            /*
             * a b c  
             *  
             *  bc a
             *  ab c 
             *  ca b
             *  bc a
             *  ab c
             *  ac b
             *  cb a
             *  ba c
             * 
             * 
             */
        }
    }
}
