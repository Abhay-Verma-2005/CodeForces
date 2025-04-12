import java.util.*;

public class CF_1433A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            System.out.println(find(n));
        }        
    }
    public static int countDig(int n){
        int count = 0;
        while(n != 0){
            n = n / 10;
            count++;
        }
        return count;
    }
    // 1,2,3,4,1,2,3,4
    public static int find(int n) {
        int x=n%10;
        int p=countDig(n);
        int res=(x-1)*10;
        int k=0;
        for(int i=1; i<=p; i++){
            k=k+i;
        }
        res=res+k;
        return res;
            }
        
        }
        
