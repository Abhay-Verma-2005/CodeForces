import java.util.*;

public class CF_379A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wax = sc.nextInt(); 
        int d =sc.nextInt();
        int ans=wax;
        int h=wax;
        while(h>=d){
            ans+=h/d;
            h= h%d+h/d;
        }
        System.out.println(ans);
    }
}
