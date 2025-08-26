import java.util.*;


public class CF_1042C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n =scanner.nextInt();
            int k =scanner.nextInt();
            int[] a1 = new int[n];
            int[] a2 = new int[n];

            for (int i=0; i <n; i++) a1[i] = scanner.nextInt();
            for (int i=0; i< n; i++) a2[i] = scanner.nextInt();

            Map<Integer, Integer> fs = new HashMap<>();
            Map<Integer, Integer> ft = new HashMap<>();

            for (int x : a1) {
                int rem = ((x%k)+k)%k;
                fs.put(rem, fs.getOrDefault(rem, 0) + 1);
            }
            for (int x : a2) {
                int rem = ((x%k)+k)%k;
                ft.put(rem,ft.getOrDefault(rem, 0) + 1);
            }

            if (fs.equals(ft)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

