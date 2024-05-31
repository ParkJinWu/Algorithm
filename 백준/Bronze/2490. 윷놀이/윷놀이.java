import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token;

        int one = 0 , zero = 0;

        for(int i = 0 ; i < 3 ; i++){
            one = 0; zero = 0;
            token = new StringTokenizer(br.readLine()," ");
            for(int j = 0 ; j < 4 ; j++){
                if(Integer.parseInt(token.nextToken()) == 1){
                    one++;
                }else {
                    zero++;
                }
            }
            if(zero == 1 && one == 3){
                System.out.println("A");
            } else if (zero == 2 && one == 2) {
                System.out.println("B");
            } else if (zero == 3 && one == 1) {
                System.out.println("C");
            }else if(zero == 4 && one == 0){
                System.out.println("D");
            }else {
                System.out.println("E");
            }
        }
    }
}
