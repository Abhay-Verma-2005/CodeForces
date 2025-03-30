import java.util.Scanner;
public class CF_2044B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            String s = sc.next();
            String k = "";
            int n= s.length();
            for(int i=n-1;i>=0;i--){
                if(s.charAt(i)=='p'){
                    k+='q';
                }
                else if(s.charAt(i)=='q'){
                    k+='p';
                }
                else{
                    k+=s.charAt(i);
                }
            }
            System.out.println(k);
        }

    }
}
