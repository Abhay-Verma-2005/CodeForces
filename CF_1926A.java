import java.util.Scanner;

public class CF_1926A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        for(int i=0;i<t;i++){
            String s = scanner.nextLine();
            int countA=0;
            int countB=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='A'){
                    countA++;
                    }
                    else if(s.charAt(j)=='B'){
                        countB++;
                    }
        }
        if(countA>countB){
            System.out.println("A");
            }
        else if(countA<countB){
            System.out.println("B");
            }
      }
  }
}
