import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 색종이 만들기
// 잘라진 종이가 모두 하얀색 또는 모두 파란색으로 칠해져 있거나, 하나의 정사각형 칸이 되어 더 이상 자를 수 없을 때까지 반복
// N/2 x N/2
public class Main {
    static int paper[][];
    static int whiteCount = 0, blueCount = 0;

    private static void divide(int x, int y, int N){
        int mark = paper[x][y];
        boolean isSame = true;

        // 범위 영억을 순회하면서 색깔 체크
        for (int i = x; i < x + N; i++) {
            for (int j = y; j < y + N; j++) {
                if(paper[i][j] != mark){
                    isSame = false;
                    break;
                }
            }
        }

        if(isSame){ // 모두 다 같다면 카운트
            if(mark == 0){
                whiteCount++;
            }else {
                blueCount++;
            }
        }else { // 분할
            int newSize = N / 2; // 범위 줄이기
            divide(x,y,newSize); // 왼쪽 위
            divide(x,y + newSize, newSize); // 오른쪽 위
            divide(x + newSize, y, newSize); // 왼쪽 아래
            divide(x + newSize, y + newSize, newSize); // 오른쪽 아래
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token;

        int N = Integer.parseInt(br.readLine());

        paper = new int[N][N];

        for (int i = 0; i < N; i++) {
            token = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                paper[i][j] = Integer.parseInt(token.nextToken());
            }
        }

        divide(0,0,N);

        System.out.println(whiteCount);
        System.out.println(blueCount);
    }
}
