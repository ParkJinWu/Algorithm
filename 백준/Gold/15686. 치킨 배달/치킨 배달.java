import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// 치킨 배달
// 도시의 치킨 거리 : 모든 집의 치킨 거리의 합
// 폐업시키지 않을 치킨집을 최대 M개를 골랐을 때, 도시의 치킨 거리의 최솟값을 출력
// |r1-r2| + |c1-c2|
public class Main {
    static final int HOUSE = 1;
    static final int CHICKEN = 2;
    static List<int[]> chickenHouses;
    static List<int[]> houses;
    static int N , M;
    static boolean[] visited;
    static int result = Integer.MAX_VALUE;

    public static int calMinChickenDistance(){
        int totalDistance = 0;

        if(chickenHouses.size() > M){
            visited = new boolean[chickenHouses.size()];
            combi(0,0);
            return result;
        }else {
            for (int[] house : houses){
                int min = Integer.MAX_VALUE;
                for (int[] chicken : chickenHouses){
                    int distance = Math.abs(house[0] - chicken[0]) + Math.abs(house[1] - chicken[1]);
                    min = Math.min(min, distance);
                }
                totalDistance += min;
            }
        }
        return totalDistance;
    }

    public static void combi(int order, int count){

        if(count == M){
            int totalDistance = 0;
            for (int[] house : houses){
                int min = Integer.MAX_VALUE;

                for (int i = 0; i < chickenHouses.size(); i++) {
                    if(visited[i]){ // 조합으로 선택된 치킨집
                        int[] chicken = chickenHouses.get(i);
                        int distance = Math.abs(house[0] - chicken[0]) + Math.abs(house[1] - chicken[1]);
                        min = Math.min(min,distance);
                    }
                }
                totalDistance += min;
            }
            result = Math.min(result, totalDistance);
            return;
        }


        for (int i = order; i < chickenHouses.size() ; i++) {
            if(!visited[i]){
                visited[i] = true;
                combi(i + 1, count + 1);
                visited[i] = false;
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        N = Integer.parseInt(token.nextToken()); // 도시 크기 N x N
        M = Integer.parseInt(token.nextToken()); // 폐업시키지 않을 치킨집의 개수
        houses = new ArrayList<>(); // 집 좌표 저장 리스트
        chickenHouses = new ArrayList<>(); // 치킨집 좌표 저장 리스트

        int[][] city = new int[N+1][N+1];

        for (int i = 1; i <= N  ; i++) {
            token = new StringTokenizer(br.readLine());

            for (int j = 1; j <= N ; j++) {
                city[i][j] = Integer.parseInt(token.nextToken());

                if(city[i][j] == HOUSE){
                    houses.add(new int[]{i,j});
                } else if (city[i][j] == CHICKEN) {
                    chickenHouses.add(new int[]{i,j});
                }
            }
        }

        System.out.println(calMinChickenDistance());

    }
}
