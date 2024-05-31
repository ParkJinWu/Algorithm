import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n ;

        while ( (n = sc.nextInt()) != -1){
            boolean flag = false;
            int sum = 0;
            list.clear();

            for(int i = 1 ; i <= n ; i++){
                if(n % i == 0) list.add(i);
            }

            list.remove(list.size()-1); // 자신 제외

            for(int i = 0 ; i < list.size() ; i++){
                sum += list.get(i);
            }

            if(n == sum){
                System.out.print(n + " = ");
                for(int i = 0 ; i < list.size() ; i++){
                    if (i > 0) System.out.print(" + ");
                    System.out.print(list.get(i));
                }
                System.out.println();
            }else {
                System.out.println(n + " is NOT perfect.");
            }
        }
    }
}
