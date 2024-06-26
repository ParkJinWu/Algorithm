import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    // 대칭 차집합
    // A와B 차집합의 원소의 개수 출력
    // A - B = A에는 속하고 B에는 속하지 않음
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(token.nextToken());
        int M = Integer.parseInt(token.nextToken());

        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();

        token = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            setA.add(Integer.parseInt(token.nextToken()));
        }

        token = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < M ; i++){
            setB.add(Integer.parseInt(token.nextToken()));
        }

        int cnt = 0;
        for(int el : setA){
            if(!setB.contains(el)){
                cnt++;
            }
        }

        for(int el : setB){
            if(!setA.contains(el)){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
