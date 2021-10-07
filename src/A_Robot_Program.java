import java.util.Scanner;

public class A_Robot_Program {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(x==y){
                System.out.println(x+y);
            }
            else{
                System.out.println(2*Math.max(x,y)-1);
            }
        }
    }
}
