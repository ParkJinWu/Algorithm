import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//영역 구하기
public class Main {
    static int rows,cols,count;
    static int[][] map;
    static ArrayList<Integer> result = new ArrayList<>();

    static int dx[] = {0,0,-1,1}; //x축 이동 (좌우)
    static int dy[] = {-1,1,0,0}; //y축 이동 (상하)

    public static void dfs(int x, int y){
        map[x][y] = 1; // 현재위치 방문처리
        count++; //영역의 개수 추가

        //상하좌우 이동
        for(int i = 0 ; i < 4 ; i++){
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if(nextX >= 0 && nextX < rows && nextY >= 0 && nextY < cols){
                if(map[nextX][nextY] == 0 ){
                    dfs(nextX,nextY);
                }
            }

        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        rows = Integer.parseInt(token.nextToken());
        cols = Integer.parseInt(token.nextToken());
        int K = Integer.parseInt(token.nextToken());

        map = new int[rows][cols];

        for(int k = 0 ; k < K ; k++){
            token = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(token.nextToken());
            int y1 = Integer.parseInt(token.nextToken());
            int x2 = Integer.parseInt(token.nextToken());
            int y2 = Integer.parseInt(token.nextToken());

            for(int y = y1 ; y < y2 ;y++){
                for(int x = x1; x < x2 ; x++){
                    map[y][x] = 1;
                }
            }

        }

//        for(int[] a : map){
//            System.out.println(Arrays.toString(a));
//        }

        //전체 순회
        for(int i = 0 ; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(map[i][j] == 0){
                    count = 0 ;
                    dfs(i,j); // 전체 순회
                    result.add(count);
                }
            }
        }

        Collections.sort(result);
        System.out.println(result.size());
        for(int n : result){
            System.out.print(n + " ");
        }



    }
}
