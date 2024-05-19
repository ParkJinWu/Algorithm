import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();

        int cnt = 0, max =0 , index =0;

        int alphabet[] = new int[26];

        for(int i = 0 ; i < str.length() ; i++){
            int idx = str.charAt(i) - 65;
            alphabet[idx]++;
        }


        for(int i = 0 ; i < alphabet.length ; i++){
            if(alphabet[i] > max){
                max = alphabet[i];
                index = i;
            }
        }

        for(int i = 0 ; i < alphabet.length ; i++){
            if(alphabet[i] == max){
                cnt++;
            }
        }
        System.out.print(cnt > 1 ? '?' : (char) (index+65));
    }
}
