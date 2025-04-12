import java.util.*;

public class CF_2091B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            Integer[] skills = new Integer[n];

            for (int i = 0; i < n; i++) {
                skills[i] = sc.nextInt();
            }

            Arrays.sort(skills, Collections.reverseOrder());
            int teams = 0, size = 0;

            for (int skill : skills) {
                size++;
                if (size * skill >= x) {
                    teams++;
                    size = 0;
                }
            }

            System.out.println(teams);
        }

        sc.close();
    }
}
