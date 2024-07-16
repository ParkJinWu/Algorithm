import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//듣보잡
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(token.nextToken()); // 듣도 못한 사람의 수
        int M = Integer.parseInt(token.nextToken()); // 보도 못한 사람의 수

        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0 ; i < N+M ; i++){
            String name = br.readLine();
            map.put(name,map.getOrDefault(name,0) + 1);
        }

        ArrayList<String> list = new ArrayList<>();

        for(String key : map.keySet()){
            if(map.get(key) >= 2){
                list.add(key);
            }
        }

        Collections.sort(list);

        br.close();
        System.out.println(list.size());
        for(String name : list){
            System.out.println(name);
        }
    }
}
