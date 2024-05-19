import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine()," ");
        int cooking = Integer.parseInt(br.readLine());
        int hour = Integer.parseInt(token.nextToken());
        int min = Integer.parseInt(token.nextToken());

        hour += cooking / 60 ;
        min += cooking % 60;

        if(min >= 60){
            hour+=1;
            min-=60;
        }
        if(hour>=24) hour -= 24;

        System.out.print(hour + " " + min);
    }
}
