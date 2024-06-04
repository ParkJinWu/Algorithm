import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token;
        int N = Integer.parseInt(br.readLine());
        int arrX[] = new int[N];
        int arrY[] = new int[N];

        for(int i = 0 ; i < N ; i++){
            token = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(token.nextToken());
            int y = Integer.parseInt(token.nextToken());
            arrX[i] = x;
            arrY[i] = y;
        }

        Arrays.sort(arrX);
        Arrays.sort(arrY);

        int w = arrX[N-1] - arrX[0];
        int h = arrY[N-1] - arrY[0];

        System.out.println(w * h);
    }
}
