import java.util.Scanner;

public class A_Flag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        int q = 0;
        String s;
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            s = sc.nextLine();
            for (int i1 = 0; i1 < m; i1++) {
                arr[q][i1] = s.charAt(i1) - '0';
            }
            q++;
        }
        boolean flag = true;

        for (int i = 0; i < n; i++) {
            int c = 0;
            int k = arr[i][0];
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == k) {
                    c++;
                }
            }
            if (c != m) {
                System.out.println("NO");
                flag = false;
                break;
            }
            if (i + 1 < n) {
                int p = i + 1;
                int check = 0;
                int k1 = arr[p][0];
                for (int j = 0; j < m; j++) {
                    if (arr[p][j] == k1) {
                        check++;
                    }
                }
                if (check != m || arr[i][0] == k1) {
                    System.out.println("NO");
                    flag = false;
                    break;
                }
            }
        }
        if (flag) {
            System.out.println("YES");
        }
    }
}