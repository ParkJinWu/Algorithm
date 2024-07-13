import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

//소트인사이드
//숫자 문자열을 내림차순 출력
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] c = br.readLine().toCharArray();
        Character[] arr = new Character[c.length];

        for(int i = 0 ; i < arr.length; i++){
            arr[i] = c[i];
        }



        Arrays.sort(arr, Collections.reverseOrder());
        for(Character ch : arr){
            sb.append(ch);
        }

        br.close();
        System.out.println(sb.toString());

    }
}
