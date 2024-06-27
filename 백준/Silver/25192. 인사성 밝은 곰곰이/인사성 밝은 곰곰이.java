import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;


public class Main {
    //인사성 밝은 곰곰이
    // ENTER 이후 사람 체크
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> set  = new HashSet<>();

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        for(int i = 0 ; i < N ; i++){
            String input = br.readLine();
            if(input.equals("ENTER")){
                set.clear();
            }else {
                if(!set.contains(input)){
                    set.add(input);
                    cnt++;
                }
            }
        }

        System.out.println(cnt);


    }
}
