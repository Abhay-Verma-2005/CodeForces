import java.util.*;

public class CF_2037A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long t = scanner.nextLong();

        while (t-- > 0) {
            int n = scanner.nextInt();
            Map<Integer, Integer> frequencyMap = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int x = scanner.nextInt();
                frequencyMap.put(x, frequencyMap.getOrDefault(x, 0) + 1);
            }
            int score = 0;
            for (int count : frequencyMap.values()) {
                score += count / 2; 
            }

            System.out.println(score);
        }

        scanner.close();
    }
}