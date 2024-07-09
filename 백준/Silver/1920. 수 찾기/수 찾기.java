import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

//수 찾기
//M줄의 배열에 존재하는지 확인 존재하면 1 아니면 0
public class Main {
    public static int binarySearch(int[] arr, int target){
        int left = 0 ; //왼쪽 포인터
        int right = arr.length-1; //오른쪽 포인터

        //두 포인터가 교차하지 않을 때 까지
        while (left <= right){
            int mid = left + (right - left) / 2;

            if(arr[mid] == target) return 1;

            if(arr[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return 0;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        // N 입력 및 배열 초기화
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        // 배열 A 입력
        StringTokenizer token = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(token.nextToken());
        }

        //오름차순 정렬
        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        token = new StringTokenizer(br.readLine());

        for(int i = 0 ; i < M ; i++){
            int num = Integer.parseInt(token.nextToken());
            sb.append(binarySearch(arr,num)).append("\n");
        }

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
