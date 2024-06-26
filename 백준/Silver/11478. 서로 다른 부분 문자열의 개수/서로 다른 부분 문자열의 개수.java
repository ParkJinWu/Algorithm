import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    //서로 다른 부분 문자열의 개수
    // 문자열 S가 주어졌을 때 서로 다른 부 문자열의 개수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        HashSet<String> set = new HashSet<>();

        for(int i = 0 ; i < S.length() ; i++){
            for (int j = i+1 ; j <= S.length() ;j++){
                set.add(S.substring(i,j));
            }
        }

        System.out.print(set.size());

    }
}
