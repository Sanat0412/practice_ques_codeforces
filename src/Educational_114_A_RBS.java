import java.util.ArrayList;
import java.util.Scanner;

public class Educational_114_A_RBS {
    static StringBuilder result = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<String> jhaat = new ArrayList<String>();
            geppppp(n, 0, 0, "", jhaat);
            for (int i = 0; i < n; i++) {
                System.out.println(jhaat.get(i));
            }
        }
    }

    static void geppppp(int n, int khula, int band, String s, ArrayList<String> gaand) {

        if (gaand.size() > n) {
            return;
        }

        if (khula == n && band == n) {
            gaand.add(s);
            return;
        }

        if (khula < n) {
            geppppp(n, khula + 1, band, s + "(", gaand);
        }

        if (band < khula) {
            geppppp(n, khula, band + 1, s + ")", gaand);
        }
    }

}
