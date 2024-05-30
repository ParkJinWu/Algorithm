import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pay = 1000 - sc.nextInt();
        int[] coins = {500, 100, 50, 10, 5, 1};
        int cnt = 0;


        for(int i = 0 ; i < coins.length; i++){
            if(pay % coins[i] >= 0){
                cnt += pay/coins[i];
                pay%=coins[i];
            }
        }
        System.out.println(cnt);
    }
}
