import java.util.*;

public class CF_2069A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt()-2;
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            
            boolean seen1 = false;
            boolean can = true;
            int prev = 0;
            
            for (int i = 0; i < n; i++) {
                if (arr[i] == 1) {
                    if (prev == 1 && seen1) {
                        can = false;
                        break;
                    }
                    seen1 = true;
                    prev = 0;
                } else {
                    prev++;
                }
            }
            
            System.out.println(can ? "YES" : "NO");
        }
        
        scanner.close();
    }
}
