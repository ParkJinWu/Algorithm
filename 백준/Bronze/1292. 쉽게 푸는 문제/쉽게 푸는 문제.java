import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<Integer>();
        int A = Integer.parseInt(token.nextToken());
        int B = Integer.parseInt(token.nextToken());

        int sum = 0;

        for(int i = 0 ; i < 1000 ; i++){
            for(int j = 0 ; j <= i ; j++){
                list.add(i+1);
            }
        }

        for(int i = A-1 ; i <= B-1 ; i++){
            sum += list.get(i);
        }
        System.out.println(sum);

    }
}
