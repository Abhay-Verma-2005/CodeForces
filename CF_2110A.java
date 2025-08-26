import java.util.*;

public class CF_2110A {

    public static int fashion(int[] arr) {
        int n = arr.length;
        if (n == 1) {
            return 1; // If there's only one element, we must remove it
        }

        // Step 1: Find Minimum and Maximum
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int evenCount = 0, oddCount = 0;

        // Step 2: Count Even and Odd Elements and find min/max
        for (int x : arr) {
            if (x % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            min = Math.min(min, x);
            max = Math.max(max, x);
        }

        // Step 3: Calculate the Sum
        int sum = min + max;

        // Step 4: Check if the Sum is Even or Odd
        if (sum % 2 == 0) {
            return 0; // Already fashionable
        } else {
            // Step 5: Determine Minimum Removals
            // If we have both even and odd numbers, we can remove one element
            if (evenCount > 0 && oddCount > 0) {
                return 1; // Remove one element of either type
            } else {
                // If all are even or all are odd, we need to remove two
                return 2; // We need to remove two elements
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            System.out.println(fashion(arr));
        }
        scanner.close();
    }
}
