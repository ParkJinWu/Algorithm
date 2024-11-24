import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer token;
        HashMap<String,String> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            token = new StringTokenizer(br.readLine());
            String name = token.nextToken();
            String work = token.nextToken();
            map.put(name,work);
        }
        ArrayList<String> list = new ArrayList<>();

        for (Map.Entry<String,String> entry : map.entrySet()){
            if(entry.getValue().equals("enter")){
                list.add(entry.getKey());
            }
        }

        Collections.sort(list);
        for (int i = list.size()-1; i >= 0 ; i--) {
            System.out.println(list.get(i));
        }
    }
}
