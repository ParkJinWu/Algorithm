import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

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

        Set<String> keys = map.keySet();

        List<String> list = new ArrayList<>(keys);
        Collections.sort(list);
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i)+" "+map.get(list.get(i)));
        }

    }
}
