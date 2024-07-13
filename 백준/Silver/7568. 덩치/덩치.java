import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        int result[] = new int[N];
        Arrays.fill(result, 1);

        for(int i = 0 ; i < N ; i++){
            StringTokenizer token = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(token.nextToken());
            int y = Integer.parseInt(token.nextToken());
            arr[i][0] = x; arr[i][1] = y;
        }

        //덩치 비교
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N ; j++){
                if(i != j && arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]){
                    result[i]++;
                }
            }
        }

        //Arrays.stream(result).forEach(i -> System.out.print(i +" "));
        StringBuilder sb = new StringBuilder();
        for(int n : result){
            System.out.print(n + " ");
        }
    }
}
