import java.util.*;
public class CF_2082A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] mtx = new int[n][m];
            for (int i = 0; i < n; i++) {
                String s=sc.next();
                for (int j = 0; j < m; j++) {
                    mtx[i][j]=s.charAt(j)-'0';
                }
            }
            int countRow=0;
            for (int i = 0; i < n; i++) {
                int a=0;
                for (int j = 0; j < m; j++) {
                    a = a^mtx[i][j];
                }
                if(a!=0){
                    countRow++;
                }
            }
            int countCol=0;

            for (int j = 0; j < m; j++) {
                int b=0;
                for (int i = 0; i < n; i++) {
                    b = b^mtx[i][j];
                }
                if(b!=0){
                    countCol++;
                }
            }
            System.out.println(Math.max(countCol,countRow));
        }
    }   
}
