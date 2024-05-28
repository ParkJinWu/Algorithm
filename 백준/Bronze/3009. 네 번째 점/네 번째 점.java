import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer token ;

        int[] x = new int[3];
        int[] y = new int[3];

        for(int i = 0 ; i < 3 ; i++){
            token = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(token.nextToken());
            y[i] = Integer.parseInt(token.nextToken());
        }

        int xx = 0,yy =0;

        if(x[0] == x[1]) xx = x[2];
        else if (x[1] == x[2]) xx = x[0];
        else xx = x[1];

        if(y[0] == y[1]) yy = y[2];
        else if (y[1] == y[2]) yy = y[0];
        else yy = y[1];

        System.out.print(xx+" "+yy);
    }
}
