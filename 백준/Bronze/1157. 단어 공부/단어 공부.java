import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine().toUpperCase();

        int cnt = 0;

        int alphabet[] = new int[26];
        Arrays.fill(alphabet,0);

        for(int i = 0 ; i < str.length() ; i++){
            int idx = str.charAt(i) - 65;
            alphabet[idx]++;
        }
        int index = 0;
        int max = 0;
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
