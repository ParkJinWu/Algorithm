import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();

        for(int i = 0 ; i < input.length() ; i++){
            char ch = input.charAt(i);
            int code = (int) ch;
                if((code >= 65 && code <= 90) || (code >= 97 && code <= 122)){ // 알파벳인 경우
                    int rot13;
                    if(code >= 65 && code <= 90){ // 대문자
                        rot13 = code + 13;
                        if(rot13 > 90) rot13 -= 26;
                    }else { // 소문자
                        rot13 = code + 13;
                        if(rot13 > 122) rot13 -= 26;
                    }
                    sb.append((char)rot13);
                }else { // 알파벳이 아닌 경우
                    sb.append(ch);
                }
        }
        System.out.println(sb);


    }
}
