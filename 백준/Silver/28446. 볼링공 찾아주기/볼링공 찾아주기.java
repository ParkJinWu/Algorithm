import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    //볼링공 찾아주기
    //1 : 입력  , 2 : 출력
    //1 5 900 -> 5번 사물함에 900 무게의 볼링공을 넣는다.
    //2 300 -> 300무게의 볼링공을 꺼낸다.이 때 key 출력
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token;
        HashMap<Integer,Integer> map = new HashMap<>();
        int N = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < N ; i++){
            token =  new StringTokenizer(br.readLine());

            int option = Integer.parseInt(token.nextToken());

            if(option == 1){
                int lockerNumber = Integer.parseInt(token.nextToken());
                int weight = Integer.parseInt(token.nextToken());
                map.put(weight, lockerNumber);

            }else if (option == 2){
                int weight = Integer.parseInt(token.nextToken());
                System.out.println(map.get(weight));
            }

        }
    }
}
