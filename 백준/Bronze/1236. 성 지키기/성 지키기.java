import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(token.nextToken());
        int M = Integer.parseInt(token.nextToken());

        char map[][] = new char[N][M];
        for (int i = 0; i < N; i++) {
            map[i] = br.readLine().toCharArray();
        }

        int row = 0;
        int col = 0;

        // 행
        for(int i = 0 ; i < N ; i++){
            boolean hasX = false;
            for (int j = 0; j < M; j++) {
                if(map[i][j] == 'X'){
                    hasX = true;
                    break;
                }
            }
            if(!hasX) row++;
        }

        // 열
        for(int i = 0 ; i < M ; i++){
            boolean hasX = false;
            for (int j = 0; j < N; j++) {
                if(map[j][i] == 'X'){
                    hasX = true;
                    break;
                }
            }
            if(!hasX) col++;
        }

        System.out.println(Math.max(row,col));
    }
}
