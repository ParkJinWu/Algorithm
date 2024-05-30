import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[5];

        for(int i = 0 ; i < 5 ; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int set1 = Math.min(arr[0] + arr[3],arr[0] + arr[4]) - 50;
        int set2 = Math.min(arr[1] + arr[3],arr[1] + arr[4]) - 50;
        int set3 = Math.min(arr[2] + arr[3],arr[2] + arr[4]) - 50;

        int set[] = {set1,set2,set3};

        Arrays.sort(set);

        System.out.println(set[0]);
    }
}
