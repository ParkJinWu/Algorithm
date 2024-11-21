import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] roomNumber = br.readLine().toCharArray();
        int[] count = new int[10];

        for (char c : roomNumber){
            count[c - '0']++;
        }

        // 6,9 처리
        count[6] = count[9] = (count[6] + count[9] + 1) / 2;

        int max = Arrays.stream(count).max().getAsInt();
        System.out.print(max);
    }
}
