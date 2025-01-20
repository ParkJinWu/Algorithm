import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

// 치킨 배달
// 도시의 치킨 거리 : 모든 집의 치킨 거리의 합
// 폐업시키지 않을 치킨집을 최대 M개를 골랐을 때, 도시의 치킨 거리의 최솟값을 출력
// |r1-r2| + |c1-c2|
public class Main {
    static final int HOUSE = 1;
    static final int CHICKEN_HOUSE = 2;
    static int minResult = Integer.MAX_VALUE;
    static boolean[] visited;

    // 치킨 거리의 최솟값 계산 함수
    public static int calMinChickenDistance(List<int[]> houses, List<int[]> chickens, int M){

        if(M < chickens.size()){
            visited = new boolean[chickens.size()];
            combinationClosed(houses,chickens,0,M,0);
            return minResult;

        }else { // 폐업할 치킨집이 없는 경우
            int totalDistance = 0;

            for (int[] house : houses){
                int minDistance = Integer.MAX_VALUE;
                for(int[] chicken : chickens){
                    int distance = Math.abs(house[0] - chicken[0]) + Math.abs(house[1] - chicken[1]);
                    minDistance = Math.min(minDistance, distance); // 최솟값 업데이트
                }
                totalDistance += minDistance;
            }
            return totalDistance;
        }
    }

    // 폐업할 치킨집을 고르는 조합 함수
    public static int combinationClosed(List<int[]> houses, List<int[]> chickens, int start, int M , int count){

        if(count == M){
            int totalDistance = 0;
            for(int[] house : houses){
                int minDistance = Integer.MAX_VALUE;
                for (int i = 0; i < chickens.size(); i++) {
                    if(visited[i]){
                        int[] chicken = chickens.get(i);
                        int distance = Math.abs(house[0] - chicken[0]) + Math.abs(house[1] - chicken[1]);
                        minDistance = Math.min(minDistance,distance);
                    }
                }
                totalDistance += minDistance;
            }
            minResult = Math.min(minResult, totalDistance);
        }

        // 백트래킹
        for (int i = start; i < chickens.size() ; i++) {
            if(!visited[i]){
                visited[i] = true;
                combinationClosed(houses,chickens,i + 1, M, count + 1);
                visited[i] = false;
            }
        }
        return minResult;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(token.nextToken()); // 도시의 크기 N x N
        int M = Integer.parseInt(token.nextToken()); // 폐업시키지 않을 치킨집의 수


        int[][] city = new int[N+1][N+1]; // 1-index
        List<int[]> chickenHouses = new ArrayList<>(); // 치킨집 좌표 저장 리스트
        List<int[]> houses = new ArrayList<>(); // 치킨집 좌표 저장 리스트

        // 치킨 도시 채우기
        for (int i = 1; i <= N ; i++) {
            token = new StringTokenizer(br.readLine());

            for (int j = 1; j <= N; j++) {
                city[i][j] = Integer.parseInt(token.nextToken());

                if(city[i][j] == HOUSE){
                    houses.add(new int[]{i,j});
                }
                else if(city[i][j] == CHICKEN_HOUSE){
                    chickenHouses.add(new int[]{i,j});
                }
            }
        }

        System.out.println(calMinChickenDistance(houses,chickenHouses,M));
    }
}
