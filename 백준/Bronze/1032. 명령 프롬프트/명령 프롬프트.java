import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        String[] str = new String[N];

        for(int i = 0 ; i < N ; i++){
            str[i] = br.readLine();
        }

        for(int i = 0 ; i < str[0].length() ; i++){ //파일의 길이는 모두 같다
            char ch = str[0].charAt(i);
            boolean is_same = true;

            for(int j = 1 ; j < N ; j++){
                if(str[j].charAt(i) != ch){
                    is_same = false;
                    //System.out.println(str[j].charAt(i)  + " " + ch);
                    break;
                }
            }

            if(is_same){
                sb.append(ch);
            }else {
                sb.append("?");
            }
        }

        System.out.println(sb);
    }
}
