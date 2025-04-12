import java.util.Scanner;

public class CF_1955A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr1= new int [n];
    for(int j=0; j<n; j++){
        int [] arr = new int [3];
        for(int i=0; i<3;i++){
            arr[i] = scanner.nextInt();
        }
        int s=arr[0]/2;
        int r=arr[0]%2;
        int a=arr[0]*arr[1];
        int b=s*arr[2]+r*arr[1];
        int min = Math.min(a, b);
        arr1[j]=min;
    }
    for(int i=0; i<n;i++){
        System.out.println(arr1[i]);
        
    }
    }
}
