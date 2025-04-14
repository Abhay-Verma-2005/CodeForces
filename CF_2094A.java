import java.util.*;

public class CF_2094A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); 
        while (t-- > 0) {
            String s = scanner.nextLine();
            String ans="";
            String[] words = s.split(" ");
            for(int i=0;i<words.length;i++){
                ans+=words[i].charAt(0);
            }
            System.out.println(ans);
        }
    }
}