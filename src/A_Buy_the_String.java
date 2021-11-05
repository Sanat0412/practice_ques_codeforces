import java.util.Scanner;

public class A_Buy_the_String {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int c0=sc.nextInt();
            int c1= sc.nextInt();
            int h=sc.nextInt();
            sc.nextLine();
            String s=sc.nextLine();
            int ans=0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i)=='0'){
                    ans+=Math.min(c0,c1+h);
                }
                else{
                    ans+=Math.min(c1,c0+h);
                }
            }
            System.out.println(ans);
        }
    }
}
