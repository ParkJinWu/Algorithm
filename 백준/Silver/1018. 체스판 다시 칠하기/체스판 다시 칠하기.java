import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
* 1. board 8 X 8 로 자르기
* 2. 다시 칠해야하는 체스판의 수 구하기
* 3. 최솟값 출력
* */
public class Main {

    static String[] whiteBoard = {"WBWBWBWB","BWBWBWBW"};
    static String[] blackBoard = {"BWBWBWBW","WBWBWBWB"};

    private static int getCount(String[] board, int row, int col, String[] pattern){
        int count = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(board[row + i].charAt(col + j) != pattern[i % 2].charAt(j)){
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int row = Integer.parseInt(token.nextToken());
        int col = Integer.parseInt(token.nextToken());

        String[] board = new String[row];

        for (int i = 0; i < row; i++) {
            board[i] = br.readLine();
        }

        int minCount = Integer.MAX_VALUE;

        for (int i = 0; i <= row - 8 ; i++) {
            for (int j = 0; j <= col - 8; j++) {
                // 두 패턴에 대해 다시 칠해야 하는 칸 계산
                int w = getCount(board,i,j,whiteBoard); // White 기준
                int b = getCount(board,i,j,blackBoard); // Black 기준
                //System.out.println("For pattern 'White': " + w + " changes" +" -> i : "+i +" j : " + j);
                //System.out.println("For pattern 'Black': " + b + " changes" +" -> i : "+i +" j : " + j);


                minCount = Math.min(minCount, Math.min(w,b));
            }
        }
        br.close();
        System.out.println(minCount);
    }


}
