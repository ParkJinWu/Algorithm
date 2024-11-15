import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int S1 = Integer.parseInt(token.nextToken());
        int S2 = Integer.parseInt(token.nextToken());
        int S3 = Integer.parseInt(token.nextToken());

        int[] s1_array = getArray(S1);
        int[] s2_array = getArray(S2);
        int[] s3_array = getArray(S3);

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for (int i = 1; i <= S1; i++) {
            for (int j = 1; j <= S2; j++) {
                for (int k = 1; k <= S3; k++) {
                    int sum = s1_array[i-1] + s2_array[j-1] + s3_array[k-1];
                    map.put(sum, map.getOrDefault(sum,0)+1);
                }
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        int maxValue = Collections.max(map.values());
        int result = Integer.MAX_VALUE;

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == maxValue && entry.getKey() < result){
                result = entry.getKey();
            }
        }

        System.out.print(result);
    }

    public static int[] getArray(int n){
        int[] arr = new int[n];

        for (int i = 1; i <= n; i++) {
            arr[i-1] = i;
        }
        return arr;
    }
}
