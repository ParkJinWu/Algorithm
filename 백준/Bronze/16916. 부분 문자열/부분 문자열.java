import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 부분 문자열
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String P = br.readLine();

        System.out.println(KMP(S,P)? 1: 0);
    }

    public static boolean KMP(String str, String pattern){
        int[] pi = pi_array(pattern);
        int idx = 0;
        for (int i = 0; i < str.length(); i++) {
            while (idx > 0 && str.charAt(i) != pattern.charAt(idx)){
                idx = pi[idx - 1];
            }

            if(str.charAt(i) == pattern.charAt(idx)){
                idx++;
            }

            if(idx == pattern.length()){
                return true;
            }
        }
        return false;
    }



    private static int[] pi_array(String pattern) {
        int[] pi = new int[pattern.length()];
        int len = 0;

        for (int i = 1; i < pattern.length(); i++) {
            while (len > 0 && pattern.charAt(i) != pattern.charAt(len)) {
                len = pi[len - 1];
            }

            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                pi[i] = len;
            }
        }
        return pi;
    }
}
