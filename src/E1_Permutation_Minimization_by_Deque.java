import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class E1_Permutation_Minimization_by_Deque {
    static StringBuilder result = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int num= sc.nextInt();
            int[] arr=new int[num];
            for (int i = 0; i < num; i++) {
                arr[i]= sc.nextInt();
            }
            Deque<Integer> deq= new ArrayDeque<Integer>();
            deq.offerFirst(arr[0]);
            for (int i = 1; i < num; i++) {
                int first = deq.peekFirst();
                int last = deq.peekLast();
                if (first < arr[i]) {
                    deq.offerLast(arr[i]);
                } else {
                    deq.offerFirst(arr[i]);
                }
            }
            StringBuilder res = new StringBuilder();
            while (!deq.isEmpty()) {
                res.append(deq.pollFirst() + " ");
            }

            res.append("\n");
            result.append(res);
        }

        System.out.print(result);
    }
        }

