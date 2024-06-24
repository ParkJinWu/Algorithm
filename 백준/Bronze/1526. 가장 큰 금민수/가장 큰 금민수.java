import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0;

        for(int i = N ; i >= 4 ; i--){
            if(isNumber(i)){
                result = i ;
                break;
            }
        }

        System.out.println(result);


    }

    public static boolean isNumber(int n){
        while (n > 0){
            int num = n % 10;
            if(num != 4 && num != 7){
                return false;
            }
            n /= 10;
        }
        return true;
    }
}
