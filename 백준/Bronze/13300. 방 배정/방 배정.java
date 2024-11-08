import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        int[] man = new int[7];
        int[] women = new int[7];


        int N = Integer.parseInt(token.nextToken());
        int K = Integer.parseInt(token.nextToken());


        double roomCount = 0; // 필요 방 개수

        // 0 : 여자, 1 : 남자
        // 학생의 성별 S, 학년 Y
        for(int i = 0 ; i < N ; i++){
            token = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(token.nextToken());
            int grade = Integer.parseInt(token.nextToken());

            if(gender == 0){ // 여자
                women[grade]++;
            }else {
                man[grade]++;
            }
        }

        for (int i = 1; i <= 6; i++) {
            //int sum = Math.round(man[i]/K) + Math.round(women[i]/K);
            roomCount += Math.ceil((double) man[i] / K);   // 남학생 방 계산
            roomCount += Math.ceil((double) women[i] / K); // 여학생 방 계산
        }

        System.out.println((int)roomCount);
    }
}
