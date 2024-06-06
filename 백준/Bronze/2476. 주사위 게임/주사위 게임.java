import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        StringTokenizer token;
        int result = 0;

        for(int i = 0 ; i < N ; i++){
            token = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(token.nextToken());
            int b = Integer.parseInt(token.nextToken());
            int c = Integer.parseInt(token.nextToken());

            if(a == b && a == c){ // 3개
                arr[i] = 10000 + a * 1000;
            } else if (a == b || a == c || b == c) { // 2개
                if(a == b || a == c){
                    arr[i] = 1000 + a * 100;
                }else {
                    arr[i] = 1000 + b * 100;
                }
            }else { // 0
                arr[i] = Math.max(a,Math.max(b,c)) * 100;
            }
        }
        Arrays.sort(arr);
        System.out.print(arr[arr.length-1]);
    }
}
