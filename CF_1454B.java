import java.util.*;

public class CF_1454B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }
            
            System.out.println(findWinner(arr));
        }
    }

    public static int findWinner(int[] arr) {
        int maxBid = 0;
        for (int bid : arr) {
            maxBid = Math.max(maxBid, bid);
        }
        
        int[] count = new int[maxBid + 1];
        int[] index = new int[maxBid + 1];
        
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
            index[arr[i]] = i + 1; 
        }
        
        int minUnique = Integer.MAX_VALUE;
        int winnerIndex = -1;
        
        for (int i = 1; i <= maxBid; i++) {
            if (count[i] == 1 && i < minUnique) {
                minUnique = i;
                winnerIndex = index[i];
            }
        }
        
        return winnerIndex;
    }
}
