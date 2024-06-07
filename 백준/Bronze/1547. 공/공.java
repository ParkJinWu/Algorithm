import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int cups[] = {0,1,0,0};
        int tmp = 0;


        for(int i = 0 ; i < N ; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            tmp = cups[x];
            cups[x] = cups[y];
            cups[y] = tmp ;
        }

        for(int i = 0 ; i < cups.length ; i++){
            if(cups[i] == 1) {
                System.out.println(i);
                break;
            }
        }
    }
}
