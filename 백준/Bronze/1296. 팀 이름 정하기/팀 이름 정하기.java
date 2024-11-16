import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String myTeam = br.readLine();
        int N = Integer.parseInt(br.readLine());

        int bestScore = -1;    // 가장 높은 점수
        String bestTeam = "";
        for (int i = 0; i < N; i++) {
            String otherTeam = br.readLine();
            int score = getFormula(myTeam,otherTeam);

            if(score > bestScore || score == bestScore && otherTeam.compareTo(bestTeam) < 0){
                bestScore = score;
                bestTeam = otherTeam;
            }
        }
        System.out.println(bestTeam);

    }

    private static int getFormula(String myTeam , String team){
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();

        for (char c : myTeam.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : team.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        //((L+O) × (L+V) × (L+E) × (O+V) × (O+E) × (V+E)) mod 100
        // LOVE 각 문자의 개수 계산
        int L = map.getOrDefault('L', 0);
        int O = map.getOrDefault('O', 0);
        int V = map.getOrDefault('V', 0);
        int E = map.getOrDefault('E', 0);

        // 공식 계산
        return ((L+O) * (L+V) * (L+E) * (O+V) * (O+E) * (V+E)) % 100;
    }
}
