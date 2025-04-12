import java.util.Scanner;

public class CF_1950A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i=0;i<t;i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
        if(a<b && b<c){
            System.out.println("STAIR");
        }
        else if (a<b && b>c) {
            System.out.println("PEAK");
        }
        else{
            System.out.println("NONE");
        }
        }
    }
}
