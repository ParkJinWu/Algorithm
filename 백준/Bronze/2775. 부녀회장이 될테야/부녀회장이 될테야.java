import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int [][] arr = new int[15][15];

        for(int i = 0 ; i < 15 ; i++){
            arr[0][i] = i; //0층 i호에는 무조건 i명이 산다
        }

        for(int i = 1; i < 15; i++){
            for(int j = 1; j < 15 ; j++){
                arr[i][j] = arr[i][j-1] + arr[i-1][j];
            }
        }


        for(int i = 0 ; i < T ; i++){
            int x = Integer.parseInt(br.readLine());
            int y = Integer.parseInt(br.readLine());

            System.out.println(arr[x][y]);
        }

    }
}
