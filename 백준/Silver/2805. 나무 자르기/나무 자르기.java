import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 나무 자르기
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer token = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(token.nextToken()); // 나무의 수
        int M = Integer.parseInt(token.nextToken()); // 가져갈 나무의 길이

        int[] trees = new int[N];

        token = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(token.nextToken());
        }

        int maxH = Arrays.stream(trees).max().getAsInt();
        int h = getHeight(maxH,trees,M);

        System.out.println(h);
    }

    public static int getHeight(int max, int[] tree, int M){
        // 필요한 만큼만 가져가야 함
        int left = 0;
        int right = max;

        while (left <= right){
            long sum = 0;
            int mid = (left + right) / 2;
            for (int i = 0; i < tree.length; i++) {
                sum += Math.max(tree[i] - mid, 0);
            }

            if(sum >= M) { // 자를 수 있으면 left 줄이기
                left = mid + 1;
            }else { // 자를 수 없다면 right 줄이기
                right = mid - 1;
            }
        }
        return right;
    }
}
