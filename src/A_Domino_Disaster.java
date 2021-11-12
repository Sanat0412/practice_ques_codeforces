import java.util.Scanner;

public class A_Domino_Disaster {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            sc.nextLine();
            String s= sc.nextLine();
            String res="";
            for (int i = 0; i < s.length(); i++) {
                char chr=s.charAt(i);
                if(chr=='D'){
                 res+='U';
                }
                else if(chr=='U'){
                    res+='D';
                }
                else{
                    res+=chr;
                }
            }
            System.out.println(res);
        }
    }
}
