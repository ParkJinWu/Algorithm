import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

//나이순 정렬
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String arr[][] = new String[N][2];

        for(int i = 0 ; i < N ; i++){
            StringTokenizer token = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(token.nextToken());
            String name = token.nextToken();
            arr[i][0] = String.valueOf(age);
            arr[i][1] = name;
        }

        Arrays.sort(arr, (a,b) -> {
            if(a[0] == b[0]){
                return Integer.parseInt(a[1]) - Integer.parseInt(b[1]);
            }else{
                return Integer.parseInt(a[0]) - Integer.parseInt(b[0]);
            }
        });

        for(int i = 0 ; i < N ; i++){
            sb.append(arr[i][0] + " " + arr[i][1]).append("\n");
        }

        br.close();
        System.out.println(sb.toString());
        
    }
}
