import java.util.Scanner;

public class A_Perfectly_imperfect_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            int count=0;
            for (int i = 0; i < n; i++) {
                int sqr=(int) Math.sqrt(arr[i]);
                if((sqr*sqr)==arr[i]){
                    count++;
                }
            }
            if(count==n){
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
