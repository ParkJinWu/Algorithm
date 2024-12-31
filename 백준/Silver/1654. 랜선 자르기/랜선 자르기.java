import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 랜선 자르기
public class Main {
    public static long getMaxLength(int[] arr , int N , int max){
        long left = 1; // 랜선의 길이는 항상 1이상
        long right = max;
        long result = 0;

        while (left <= right){
            long count = 0;
            long mid = (left + right) / 2;

            for (int i = 0; i < arr.length; i++) {
                count += arr[i] / mid; // mid로 잘랐을 때 몇 개의 랜선이 나오는 지
            }

            if(count >= N){ // 필요한 랜선의 개수 이상이면 길이를 늘린다.
                result = mid; // 현재의 길이가 최대의 길이
                left = mid + 1;
            }else { // 필요한 랜선의 개수 이하면 길이를 줄인다.
                right = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(token.nextToken()); // 랜선의 개수
        int N = Integer.parseInt(token.nextToken()); // 필요한 랜선 개수

        int lanCable[] = new int[K];
        for (int i = 0; i < K; i++) {
            lanCable[i] = Integer.parseInt(br.readLine());
        }

        int maxLen = Arrays.stream(lanCable).max().getAsInt();

        System.out.println(getMaxLength(lanCable,N,maxLen));
    }
}
