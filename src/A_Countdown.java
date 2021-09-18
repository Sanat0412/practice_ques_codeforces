import java.util.Scanner;

public class A_Countdown {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            sc.nextLine();
            String s=sc.nextLine();
            int res=0;
            for (int i = 0; i < n; i++) {
                char d=s.charAt(i);
                int b=Integer.parseInt(d+"");
                if(i!=n-1 && b!=0){
                    res+=b;
                    res++;
                }
                else if(b!=0){
                    res+=b;
                }
            }
            System.out.println(res);
        }
    }
}
