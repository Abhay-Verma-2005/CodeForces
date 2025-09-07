import java.util.*;

public class CF_2137B{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]= sc.nextInt();
            }
            n=n+1;
            for(int i=0;i<n-1;i++){
                arr[i]= n-arr[i];
            }
            for(int i=0;i<n-1;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}
