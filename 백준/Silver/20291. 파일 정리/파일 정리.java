import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    //파일 정리
    //확장자별로 구분 & 확장자의 사전순으로 내림차순
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,Integer> map = new HashMap<>();
        StringTokenizer token;

        int N = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < N ; i++){
            String[] url = br.readLine().split("\\.");
            String extension = url[1];
            map.put(extension,map.getOrDefault(extension,0)+1);
        }

        map.entrySet()
                .stream()
                .sorted((e1,e2) -> e1.getKey().compareTo(e2.getKey()))
                .forEach(el -> System.out.println(el.getKey() + " " + el.getValue()));
    }
}
