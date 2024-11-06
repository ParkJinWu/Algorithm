import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    // 첫 번째 대회 상금 테이블 (순위 범위별 인원 수와 상금)
    private static final int[] FIRST_COMPETITION_PRIZES = {500, 300, 200, 50, 30, 10};
    private static final int[] FIRST_COMPETITION_RANKS = {1, 2, 3, 4, 5, 6}; // 각 상금 구간의 인원 수

    // 두 번째 대회 상금 테이블 (순위 범위별 인원 수와 상금)
    private static final int[] SECOND_COMPETITION_PRIZES = {512, 256, 128, 64, 32};
    private static final int[] SECOND_COMPETITION_RANKS = {1, 2, 4, 8, 16}; // 각 상금 구간의 인원 수


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer token;

        for(int i = 0 ; i < T ; i++){
            int result = 0;
            token = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(token.nextToken());
            int b = Integer.parseInt(token.nextToken());

            result = (firstCompetition(a) + secondCompetition(b)) * 10000;
            sb.append(result).append("\n");
        }
        br.close();
        System.out.println(sb.toString());

    }// main

    private static int firstCompetition(int rank){
        if(rank == 0) return 0;
        int limit = 0;
        for(int i = 0 ; i < FIRST_COMPETITION_RANKS.length; i++){
            limit += FIRST_COMPETITION_RANKS[i];
            if(rank <= limit){ // 상금을 받을 수 있는 인원에 포함이 된다면
                return FIRST_COMPETITION_PRIZES[i];
            }
        }
        return 0; // 상금 인원에 포함 X
    }

    private static int secondCompetition(int rank){
        if(rank == 0) return 0;
        int limit = 0;
        for(int i = 0 ; i < SECOND_COMPETITION_RANKS.length; i++){
            limit += SECOND_COMPETITION_RANKS[i];
            if(rank <= limit){ // 상금을 받을 수 있는 인원에 포함이 된다면
                return SECOND_COMPETITION_PRIZES[i];
            }
        }
        return 0; // 상금 인원에 포함 X
    }
}
