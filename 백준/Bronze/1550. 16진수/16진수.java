import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] ch = br.readLine().toCharArray();
        int result = 0;
        int idx = 0;
        for(int i = ch.length -1 ; i >=0 ; i--){ //뒤에서 부터
            char c = ch[i];
            if(c >= 'A' && c <= 'Z'){
                result += (c - 55) * (int) Math.pow(16,idx++);
            }else {
                result += (c - '0') * (int) Math.pow(16,idx++);
            }
        }
        System.out.println(result);

    }
}
