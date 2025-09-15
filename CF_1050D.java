import java.util.*;

public class CF_1050D{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n =sc.nextInt();
            Long [] arr = new Long[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextLong();
            }
            Arrays.sort(arr);
            ArrayList<Long> even = new ArrayList<>();
            ArrayList<Long> odd = new ArrayList<>();
            long e=0;
            for(int i=0;i<n;i++){
                if(arr[i]%2==0) {
                    even.add(arr[i]);
                    e+=arr[i];
                }
                else odd.add(arr[i]);
            }

            long sum=0;
            if(odd.size()!=0){
                sum=e;
            }
            Collections.reverse(odd);
            long j=0;
            int en=(odd.size()+1)/2;
            for(long ele: odd){
                if(j>=en){
                    break;
                }
            sum+=ele;
                j++;
            }
            System.out.println(sum);
        }

    }
}
