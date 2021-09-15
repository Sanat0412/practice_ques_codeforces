import java.util.Scanner;

public class dieRoll {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int y= sc.nextInt();
        int w=sc.nextInt();
        String die[]={"1/6", "1/3", "1/2", "2/3", "5/6", "1/1"};
        int a=Math.max(y,w);
        System.out.println(die[6-a]);
    }
}
