import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0;

        for(int i = 1 ; i <= N ; i++){
            if(N == findAnalyzeSum(i)){
                result = i;
                break;
            }
        }
        System.out.println(result);
    }

    public static int findAnalyzeSum(int n){
        int sum = n;
        String str = String.valueOf(n);
        for(int i = 0 ; i < str.length() ; i++){
            sum += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return sum;


    }
}
