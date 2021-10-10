import java.util.Scanner;

public class A_Army {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();  }

        int a = sc.nextInt();
        int b = sc.nextInt();
int sum=0;
        for (int i = a - 1; i < b - 1; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}