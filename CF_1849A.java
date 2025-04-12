import java.util.Scanner;

public class CF_1849A{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int b = scanner.nextInt();
            int h = scanner.nextInt();
            int c = scanner.nextInt();

        if (((c+h)+1)>b){
            System.out.println(b*2-1);
        }
        else if(b==c+h+1){
            System.out.println(b+c+h);
        }
        else{
            System.out.println((c+h)*2+1);
        }

    }
}
}
