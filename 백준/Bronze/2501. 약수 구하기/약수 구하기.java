import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokne = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(tokne.nextToken());
        int K = Integer.parseInt(tokne.nextToken());

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 1; i <= N; i++){
            if(N % i == 0) list.add(i);
        }


        try {
            System.out.print(list.get(K-1));
        }catch (IndexOutOfBoundsException e){
            System.out.print(0);
        }
    }
}
