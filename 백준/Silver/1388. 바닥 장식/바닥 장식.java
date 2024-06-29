import java.io.*;
import java.util.*;

//바닥 장식
//바닥은 -와 |만 존재, 모든 -와 |를 방문처리 한 횟수
//dfs

public class Main {
    static int N,M;
    static boolean[][] visitied;
    static char[][] floor;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        N = Integer.parseInt(token.nextToken());
        M = Integer.parseInt(token.nextToken());

        floor = new char[N][M];
        visitied = new boolean[N][M];

        for(int i = 0 ; i < N ; i++){
            String line = br.readLine();
            for(int j = 0 ; j < M ; j++){
                floor[i][j] = line.charAt(j);
            }
        }


        int cnt = 0;

        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < M ; j++){
                if(!visitied[i][j]){
                    dfs(i,j);
                    cnt++;
                }
            }
        }

        System.out.println(cnt);


    }
    public static void dfs(int x, int y){
        visitied[x][y] = true; // 방문 체크

        char now = floor[x][y]; //현재 위치

        if(now == '-'){
            // 모든 '-' 방문 -> y방향 이동(열 이동)
            if(y+1 < M && floor[x][y+1] == '-' && !visitied[x][y+1]){
                dfs(x,y+1);
            }
        } else if (now == '|') {
            // 모든 '|' 방문 -> x방향 이동(행 이동)
            if(x+1 < N && floor[x+1][y] == '|' && !visitied[x+1][y]){
                dfs(x+1,y);
            }
        }

    }
}
