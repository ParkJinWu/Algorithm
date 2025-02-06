import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 연산자 끼워 넣기
// [+, -, *, %]
public class Main {
    static StringTokenizer token;
    static int max = Integer.MIN_VALUE;  // 최댓값
    static int min = Integer.MAX_VALUE;  // 최솟값
    static int N;  // 수열의 길이

    private static void dfs(int[] num, int[] operation, int count, int tmp){
        // 탈출 조건 : 연산자 다 사용 시
        if(count == N-1){
            max = Math.max(max,tmp);
            min = Math.min(min,tmp);
            return;
        }

        for (int i = 0; i < 4 ; i++) {
            if(operation[i] > 0){ // 연산자가 있다면
                operation[i]--; // 연산자 사용

                switch (i){
                    case 0 : // 덧셈
                        dfs(num,operation,count + 1 , tmp + num[count + 1]);
                        break;
                    case 1: // 뺄셈
                        dfs(num,operation,count + 1, tmp - num[count + 1]);
                        break;
                    case 2: // 곱셈
                        dfs(num,operation,count + 1, tmp * num[count + 1]);
                        break;
                    case 3: // 나눗셈
                        dfs(num,operation,count + 1, tmp / num[count + 1]);
                        break;
                }

                operation[i]++; // 연산자 원복 : 백트래킹
            }
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        int num[] = new int[N];
        int operator[] = new int[4];

        // 수열 저장
        token = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(token.nextToken());
        }

        // 연산자 저장
        token = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            operator[i] = Integer.parseInt(token.nextToken());
        }

        dfs(num,operator,0,num[0]);
        System.out.println(max);
        System.out.println(min);

    }
}
