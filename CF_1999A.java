import java.util.Scanner;
public class CF_1999A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i=0;i<t;i++){
            int n = scanner.nextInt();
            int sum = 0;
            while(n>0){
                sum += n%10;
                n /= 10;
            }
            System.out.println(sum);
        }
    }
    
}
