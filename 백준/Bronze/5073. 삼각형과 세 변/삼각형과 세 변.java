import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token;
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[3];

        while (true){
            token = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(token.nextToken());
            int b = Integer.parseInt(token.nextToken());
            int c = Integer.parseInt(token.nextToken());

            if(a+b+c == 0) break;

            arr[0] = a;
            arr[1] = b;
            arr[2] = c;

            int maxAngle = Math.max(Math.max(a,b),c);
            int sum = 0;
            int idx = 0;

            // max 값의 인덱스 찾기
            for (int i = 0; i < arr.length; i++) {
                if(maxAngle == arr[i]){
                    idx = i ;
                    break;
                }
            }

            // 삼각형인지 구하기
            for (int i = 0; i < arr.length; i++) {
                if(idx == i) continue;
                sum+= arr[i];
            }

            if(maxAngle < sum){
                if(a == b & b == c){
                    sb.append("Equilateral").append("\n");
                } else if (a == b || b == c || a == c) {
                    sb.append("Isosceles").append("\n");
                }else{
                    sb.append("Scalene").append("\n");
                }
            }else {
                sb.append("Invalid").append("\n");
            }

        }
        System.out.println(sb.toString());
    }
}
