import java.util.*;
public class A_AB_Balance{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long[] arr=new long[n];
            int count=0;
            long sum=0;
            boolean ans=true;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextLong();
                count+=i;
                sum+=arr[i];

                if(sum<count){
                    ans=false;

                }  }
            if(ans){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
}