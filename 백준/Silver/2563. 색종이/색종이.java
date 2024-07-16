import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//색종이
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        //배열 초기화 
        int[][] paper = new int[100][100];
        int size = 0;

        StringTokenizer token;
        for(int t = 0; t < T ; t++){
            token = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(token.nextToken());
            int y = Integer.parseInt(token.nextToken());

            //도화지에 색종이 붙이기
            for(int i = x; i < x + 10; i++){
                for(int j = y; j < y + 10; j++){
                    paper[i][j] = 1;
                }
            }
        }

        for(int i = 0; i < 100 ; i++){
            for(int j = 0 ; j < 100 ; j++){
                if(paper[i][j] == 1) size++;
            }
        }
        br.close();
        System.out.println(size);
    }
}
