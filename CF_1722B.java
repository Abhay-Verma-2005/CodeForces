import java.util.*;

public class CF_1722B {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            isPossible(s1,s2);
        }
    }
    public static void isPossible(String s1 , String s2){
        String s3="";
        String s4="";

        if (s1.length()==s2.length()){
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) == 'G') {
                    s3+="B";
                } else{
                    s3+=s1.charAt(i);
                }
            }
            for (int i = 0; i < s2.length(); i++) {
                if (s2.charAt(i) == 'G') {
                    s4+="B";
                } else{
                    s4+=s2.charAt(i);
                }
            }
            if (s3.equals(s4)){
                System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                    }
            }
        else{
            System.out.println("No");
        }
    }
}
// WHY FOR THIS TESTCASE IT NO
// RGBBGGRGB
// RGGGGGRBB
// No
