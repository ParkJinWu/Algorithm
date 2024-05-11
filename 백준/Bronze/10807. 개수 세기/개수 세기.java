import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N]; // 입력받은 N크기의 배열 생성
        int count = 0;

        StringTokenizer token = new StringTokenizer(br.readLine()); // 한줄로 입력받음

        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(token.nextToken()); // 쪼개준 문자열을 캐스팅하여 배열 요소에 저장
        }

        int target = Integer.parseInt(br.readLine()); // 3번째로 입력받는 정수 v

        for(int i = 0 ; i < N ; i++){
            if(arr[i] == target) count++;
        }

        System.out.println(count);
    }
}
