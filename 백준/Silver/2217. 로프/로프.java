import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    // 로프
    // 로프가 버틸 수 있는 최대 중량 리턴
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int rope[] = new int[N];

        int max = 0 ;

        for(int i = 0 ; i < N ; i++){
            rope[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(rope);

        for(int i = rope.length-1 ; i >= 0 ; i--){
            max = Math.max(max,rope[i] * (N-i));
        }

        System.out.println(max);
    }
}
