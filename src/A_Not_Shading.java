import java.util.Scanner;

public class A_Not_Shading {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int m=sc.nextInt();
            int n= sc.nextInt();
            int r=sc.nextInt();
            int c=sc.nextInt();
sc.nextLine();
            boolean[] rows = new boolean[m];
            boolean[] cols = new boolean[n];
            boolean flag = false;
            char[][] ch=new char[m][n];
            for (int i = 0; i <m ; i++) {
                String temp = sc.nextLine();
                for (int j = 0; j < n; j++) {
                    ch[i][j] = temp.charAt(j);
                    if (ch[i][j] == 'B') {
                        rows[i] = true;
                        cols[j] = true;
                        flag = true;
                    }
                }
            }

            if (ch[r - 1][c - 1] == 'B') {
                System.out.println(0);
            } else if (rows[r - 1] || cols[c - 1]) {
                System.out.println(1);
            } else if (flag) {
                System.out.println(2);
            } else {
                System.out.println(-1);

            }
        }
    }
}
