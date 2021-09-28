import java.util.Scanner;

public class A_Casimirs_String_Solitaire {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s= sc.nextLine();
            int a=0;
            int b=0;
            int c=0;

            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i)=='A')
                    a+=1;
                else if (s.charAt(i)=='B')
                    b+=1;
                else if (s.charAt(i)=='C')
                    c+=1;
            }
            if(b==(a+c)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
