import java.io.*;
import java.util.*;
import java.lang.*;

public class A_Computer_game {

    static final int MOD = (int) 1e9 + 7;
    static final int INT_POSITIVE_INFINITY = Integer.MAX_VALUE;
    static final long LONG_POSITIVE_INFINITY = Long.MAX_VALUE;
    static final int INT_NEGATIVE_INFINITY = Integer.MIN_VALUE;
    static final long LONG_NEGATIVE_INFINITY = Long.MIN_VALUE;
    static StringBuilder result = new StringBuilder();
    static Pair[][] visited = new Pair[3][101];

    static class Pair {
        int a;
        boolean b;

        public Pair(int a, boolean b) {
            this.a = a;
            this.b = b;
        }
    }

    public static void main(String args[]) throws IOException {
        FastReader fr = new FastReader();

        int t = fr.nextInt();
        while (t-- > 0) {
            int test = fr.nextInt();
            int[][] arr = new int[2][test];

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < test; j++) {
                    visited[i][j] = new Pair(-1, false);
                }
            }

            for (int i = 0; i < 2; i++) {
                char[] chars= fr.nextLine().toCharArray();
                for (int j = 0; j < test; j++) {
                    arr[i][j] = Integer.parseInt(chars[j] + "");
                }
            }
            result.append(dfs(arr, 0, 0, test) ? "YES\n" : "NO\n");
        }
        System.out.print(result);
    }

    static boolean dfs(int[][] arr, int i, int j, int test) {
        if (i < 0 || j < 0 || i >= 2 || j >= test || arr[i][j] == 1)
            return false;
        if (visited[i][j].a != -1)
            return visited[i][j].b;
        if (i == 1 && j == test - 1 && arr[i][j] == 0)
            return true;
        visited[i][j].a = 1;
        visited[i][j].b = dfs(arr, i + 1, j + 1, test) || dfs(arr, i + 1, j, test) || dfs(arr, i, j + 1, test)
                || dfs(arr, i - 1, j + 1, test);
        return visited[i][j].b;
    }

    static class FastReader {
        InputStreamReader ir;
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            ir = new InputStreamReader(System.in);
            br = new BufferedReader(ir);
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    static int fastPow(long b, long e) {
        long curr = b;
        long res = 1;

        while (e != 0) {
            if ((e & 1) != 0) {
                res = (res * curr) % MOD;
            }
            curr = (curr * curr) % MOD;
            e >>= 1;
        }

        return (int) res;
    }

    static int gcd(int a, int b) {
        if (b > a) {
            return gcd(b, a);
        }

        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }

}