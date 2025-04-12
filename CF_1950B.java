import java.util.Scanner;

public class CF_1950B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while (t > 0) {
            long n = scanner.nextLong();
            for (int i = 1; i <= n; i++) {
                for(int c=0 ;c<2 ;c++){
                    for (int j = 1; j <= n; j++) {
                        if ((i + j) % 2 == 0) {
                            System.out.print("##");
                        } else {
                            System.out.print("..");
                        }
                    }
                    System.out.println();
                }
            }
            t--;
        }

    }
}
