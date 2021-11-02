import java.util.Arrays;
import java.util.Scanner;

public class C_Minimum_Extraction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
           int  presum=arr[0];
           int sum=arr[0];
            for (int i = 1; i < n; i++) {
               arr[i]-=presum;
                sum=Math.max(sum,arr[i]);
                presum+=arr[i];
            }
            System.out.println(sum);
        }
    }
}
