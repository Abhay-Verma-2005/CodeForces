import java.util.*;

public class CF_21114C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long t = scanner.nextInt();
         while (t-- > 0) {
            int n=scanner.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i]=scanner.nextInt();
            }
            int c=1;
            int i=0;
            int j=1;
            while(i<n && j< n){
                if(arr[i]+1<arr[j]){
                    c++;
                    i=j;
                    j++;
                }
                else{
                    j++;
                }
            }
            System.out.println(c); 
        }
    }
}
