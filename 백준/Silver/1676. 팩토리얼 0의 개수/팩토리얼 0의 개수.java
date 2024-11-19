import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        BigInteger factorialNumber = factorial(N); // BigInteger로 팩토리얼 계산
        int cnt = 0;

        // 팩토리얼을 문자열로 바꾸고 끝에서부터 '0'을 세기
        String factorialString = factorialNumber.toString();
        for (int i = factorialString.length() - 1; i >= 0; i--) {
            if(factorialString.charAt(i) == '0'){ // '0' 문자와 비교
                cnt++;
            } else {
                break; // '0'이 아닌 숫자가 나오면 종료
            }
        }
        System.out.println(cnt);
    }

    // BigInteger로 팩토리얼 계산
    private static BigInteger factorial(int n){
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i)); // BigInteger로 곱셈
        }
        return result;
    }
}
