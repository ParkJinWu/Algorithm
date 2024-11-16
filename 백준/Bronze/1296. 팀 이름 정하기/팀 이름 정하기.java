import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String yeondu = br.readLine();
        int N = Integer.parseInt(br.readLine());

        String bestTeam = "";
        int bestScore = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            String otherTeam= br.readLine();
            int score = getScore(yeondu,otherTeam);
            if(score > bestScore || score == bestScore && otherTeam.compareTo(bestTeam) < 0){
                bestTeam = otherTeam;
                bestScore = score;
            }
        }
        System.out.println(bestTeam);
    }

    private static int getScore(String myTeam, String otherTeam){
        HashMap<Character,Integer> map = getMap(myTeam,otherTeam);

        // LOVE 각 문자의 개수 계산
        int L = map.getOrDefault('L', 0);
        int O = map.getOrDefault('O', 0);
        int V = map.getOrDefault('V', 0);
        int E = map.getOrDefault('E', 0);

        // 공식 계산: ((L+O) × (L+V) × (L+E) × (O+V) × (O+E) × (V+E)) mod 100
        return ((L+O) * (L+V) * (L+E) * (O+V) * (O+E) * (V+E)) % 100;
    }

    private static HashMap<Character,Integer> getMap(String myTeam, String otherTeam){
        HashMap<Character,Integer> map = new HashMap<>();

        // 연두 팀의 문자 개수 계산
        for(char c : myTeam.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        // 다른 팀의 문자 개수 추가
        for(char c : otherTeam.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        return map;
    }
}
