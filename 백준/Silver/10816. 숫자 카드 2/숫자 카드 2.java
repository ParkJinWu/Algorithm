import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer token = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            arr[i] =  Integer.parseInt(token.nextToken());
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < N ; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        int M = Integer.parseInt(br.readLine());
        token = new StringTokenizer(br.readLine());

        for(int i = 0 ; i < M ; i++){
            int num = Integer.parseInt(token.nextToken());
            sb.append(map.getOrDefault(num, 0)).append(" ");
        }

        System.out.println(sb.toString());
    }
}
