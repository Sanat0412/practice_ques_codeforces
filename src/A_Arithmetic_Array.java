import java.util.Scanner;

public class A_Arithmetic_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            int sum=0;
            for (int i = 0; i < n; i++) {
                sum+=arr[i];
            }
            if(sum==n){
                System.out.println(0);
            }
            else if(sum<n){
                System.out.println(1);
            }
            else if (sum>n){
                System.out.println(sum-n);
            }
        }
    }
}
