import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String target = Integer.toString(num);
        int sum = 0;
        int cnt = 0 ;

        if(num < 10){
            target = "0"+ target;
        }

        while (true){
            String a = Character.toString(target.charAt(0));
            String b = Character.toString(target.charAt(1));

            sum = Integer.parseInt(a) + Integer.parseInt(b);
            String tmp = Integer.toString(sum);
            target = b + Character.toString(tmp.charAt(tmp.length()-1));

            ++cnt;

            if(Integer.parseInt(target) == num){
                System.out.println(cnt);
                break;
            }
        }
    }
}
