import java.util.Scanner;

public class CF_1328A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int [] arr = new int [t];
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int r = a % b;
            if (r == 0) {
                arr[i]=0;
            } else {
                arr[i]=b - r;
            }
        }
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
