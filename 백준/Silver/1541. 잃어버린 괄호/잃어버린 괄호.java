import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
* 잃어버린 괄호
* 괄호를 적절히 쳐서 최소값을 만들어라
* */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] subtraction = br.readLine().split("-");

        int result = 0;

        // 첫 번째 항목은 더하기 처리
        result = sum(subtraction[0]);


        // 이후에 나오는 항목들은 모두 빼기
        for (int i = 1; i < subtraction.length; i++) {
                result -= sum(subtraction[i]);
        }
        System.out.println(result);
    }

    public static int sum(String number){
        String[] num = number.split("\\+");  // '+' 기준으로 문자열 나누기

        int result = 0;
        for (int i = 0; i < num.length; i++) {
            result += Integer.parseInt(num[i]);
        }

        return result;
    }
}
