import java.util.Scanner;

public class AB_Balance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s= sc.nextLine();
            String ans="";
            int n=s.length();
            char first=s.charAt(0);
            char last=s.charAt(n-1);
            if(first==last){
                System.out.println(s);
            }
            else{
                System.out.println(last+s.substring(1, n-1)+last);
            }
        }
    }
}
