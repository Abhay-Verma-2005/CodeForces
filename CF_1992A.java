import java.util.*;

public class CF_1992A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            int c=scanner.nextInt();
            for(int i=0;i<5;i++){
                if(a<=b && a<=c){
                    a++;
                }
                else if(b<=a && b<=c){
                    b++;
                }
                else{
                    c++;
                }
            }
            System.out.println(a*b*c);
        }
    }


}
