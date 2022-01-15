import java.util.Arrays;
import java.util.Scanner;

public class C_Make_Them_Equal {
    static boolean[] sieve = new boolean[1000000];

    static void helper() {
        Arrays.fill(sieve, true);
        for (int i = 2; i * i <= 1000000; i++) {
            if (sieve[i]) {
                for (int j = i * i; j < 1000000; j += i) {
                    sieve[i] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            int n = sc.nextInt();
            char c = sc.next().charAt(0);
            String s = sc.nextLine();
            char[] arr = s.toCharArray();   
        }
    }
}
