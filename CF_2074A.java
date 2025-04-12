import java.util.*;
public class CF_2074A {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        for(int i =0; i <t;i++) { 
            int l = sc.nextInt();
            int r = sc.nextInt(); 
            int d = sc.nextInt(); 
            int u = sc.nextInt(); 
            
            int s1 = ((-l)-r)*((-l)-r)+(0-0)*(0-0);
            int s2 = ((-l)-0)*((-l)-0)+(0-(-d))*(0-(-d));
            int s3 = ((-l)-0)*((-l)-0)+(0-u)*(0-u);
            int s4 = (r-0)*(r-0)+(0-(-d))*(0-(-d));
            int d5 = (r-0)*(r-0)+(0-u)*(0-u);
            int d6 = (0-0)*(0-0)+((-d)-u)*((-d)-u);

            int[] arr = {s1, s2, s3, s4, d5, d6};
            Arrays.sort(arr);
            if((arr[0] == arr[1]) && (arr[1] == arr[2]) && (arr[2] == arr[3]) && (arr[4] == arr[5]) && (arr[4] == 2 * arr[0])) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
