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


        int M = Integer.parseInt(br.readLine());
        int arrM[] = new int[M];

        token = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < M ; i++){
            int num = Integer.parseInt(token.nextToken());
            arrM[i] = num;
            map.put(num,0);
        }

        for(int i = 0 ; i < N ; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for(int i = 0 ; i < M ; i++){
            sb.append(map.get(arrM[i])).append(" ");

        }
        System.out.println(sb.toString());
    }
}
