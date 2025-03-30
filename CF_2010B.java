import java.util.Scanner;

public class CF_2010B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr={1,2,3};
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        for(int i=0;i<arr.length;i++){
            if (arr[i]!=a && arr[i]!=b){
                System.out.println(arr[i]);
            }
        }
    }
}
