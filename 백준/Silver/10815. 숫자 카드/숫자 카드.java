import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer token = new StringTokenizer(br.readLine());
        int[] arrN = new int[N];

        for (int i = 0; i < N; i++) {
            arrN[i] = Integer.parseInt(token.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        int[] arrM = new int[M];

        token = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            arrM[i] = Integer.parseInt(token.nextToken());
        }

        Arrays.sort(arrN); // 정렬

        // 결과 출력
        StringBuilder sb = new StringBuilder();
        for (int num : arrM) {
            if (binarySearch(arrN, num)) {
                sb.append(1).append(" ");
            } else {
                sb.append(0).append(" ");
            }
        }

        // 결과 출력
        System.out.println(sb);

    }

    private static boolean binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length -1;

        while (left <= right){
            int mid = left + (right - left) / 2;

            if(arr[mid] == target){
                return true;
            }
            if(arr[mid] < target){
                left = mid + 1; // 오른쪽으로 범위 좁히기
            }else {
                right = mid - 1; // 왼쪽으로 범위 좁히기
            }
        }
        return false; // not found
    }

}
