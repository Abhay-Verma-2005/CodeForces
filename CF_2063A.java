import java.util.Scanner;

public class CF_2063A{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long t = scanner.nextLong();
        while (t-- > 0) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            
            long result = b - a;
            if (a == b && a == 1) {
                result += 1;
            }
            
            System.out.println(result);
        }
        
        scanner.close();
    }
}
