import java.util.Scanner;

public class CF_2043A{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long t = scanner.nextLong();
        while (t-- > 0) {
            long a = scanner.nextLong();

            int p=2;
            int ans=1;
            while(a>3){
                    a=a/4;
                    ans*=p;
            }
            if(a==0){
                ans=0;
            }
            System.out.println(ans);
        }
    }
}

