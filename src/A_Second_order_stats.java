import java.util.Arrays;
import java.util.Scanner;

public class A_Second_order_stats {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int[] brr=new int[n];
        int j=0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                brr[j++] = arr[i];
            }
        }

        brr[j++] = arr[n - 1];
        for (int i = 0; i < j; i++) {
            arr[i] = brr[i];
        }
        Arrays.sort(arr);
        System.out.println(arr[0]);
    }
}
