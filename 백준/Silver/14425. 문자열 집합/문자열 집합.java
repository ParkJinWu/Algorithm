import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    //문자열 집합
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        int cnt = 0 ;

        int N = Integer.parseInt(token.nextToken());
        int M = Integer.parseInt(token.nextToken());

        HashMap<String ,Integer> map = new HashMap<>();

        for(int i = 0 ; i < N ; i++){
            String str = br.readLine();
            map.put(str,0);
        }

        for(int i = 0 ; i < M ; i++){
            if(map.containsKey(br.readLine())){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
