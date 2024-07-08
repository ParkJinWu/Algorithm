import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//5와 6의 차이
//5 <-> 6 최솟값 최댓값 출력
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String numArr[] = br.readLine().split(" ");
        int min = 0;
        int max = 0;

        for(String num : numArr){
            String minNum = num.replace("6","5"); // 6 -> 5
            String maxNum = num.replace("5","6"); // 5 -> 6

            min += Integer.parseInt(minNum);
            max += Integer.parseInt(maxNum);
        }

        System.out.println(min +" " + max);

    }
}
