import java.util.Scanner;

public class CF_2009A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr1= new int [n];
        for(int j=0; j<n; j++){
            int [] arr= new int [2];
            arr[0] = scanner.nextInt();
            arr[1] = scanner.nextInt();
            int x=arr[1]-arr[0];
            arr1[j]=x;
        }
        for(int i=0; i<n;i++){
            System.out.println(arr1[i]);
        }
    }
}
 
