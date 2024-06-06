import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer token = new StringTokenizer(br.readLine());
        int arr[] = new int[N];

        for(int i = 0 ; i < N ; i++){ // 배열 초기화
            arr[i] = Integer.parseInt(token.nextToken());
        }

        int y_sum = 0, m_sum = 0;

        for(int i = 0; i < arr.length ; i++){
            y_sum += (arr[i] / 30 + 1) * 10;
            m_sum += (arr[i] / 60 + 1) * 15;
        }

        if(y_sum == m_sum){
            System.out.println("Y M " +y_sum);
        } else if (y_sum > m_sum) {
            System.out.println("M " + m_sum);
        }else {
            System.out.println("Y " + y_sum);
        }


    }
}
