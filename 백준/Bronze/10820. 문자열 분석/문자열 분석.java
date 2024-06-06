import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str ;

        while ((str = br.readLine()) != null){ // 입력이 주어지지 않을 때 까지 반복
            StringBuilder sb = new StringBuilder();
            int a = 0 , b = 0 , c = 0, d = 0;

            char[] ch = str.toCharArray();

            for(int i = 0 ; i < ch.length ; i++){
                if(Character.isLowerCase(ch[i])) a++;
                if(Character.isUpperCase(ch[i])) b++;
                if(Character.isDigit(ch[i])) c++;
                if (ch[i] == ' ') d++;
            }

            sb.append(a + " " + b + " " + c + " " + d);
            System.out.println(sb);
        }


    }
}
