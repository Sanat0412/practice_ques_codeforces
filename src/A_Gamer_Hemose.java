import java.util.*;

public class A_Gamer_Hemose {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int h= sc.nextInt();
            ArrayList<Integer> arr=new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
            }
            int a=0;
            int b=0;
            for (int i = 0; i < n; i++) {
                int input = arr.get(i);
                if (input >= a) {
                    b = a;
                    a = input;
                } else if (input > b) {
                    b = input;
                }
            }
            int count = (h % (a + b)) == 0 ? 2 * (h / (a + b))
                    : (h % (a + b)) <= a ? 2 * (h / (a + b)) + 1 : 2 * ( h/ (a + b)) + 2;


        System.out.println(count);
    }  }
        }

