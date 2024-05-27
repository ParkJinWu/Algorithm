import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token ;
        while (true){
            token = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(token.nextToken());
            int b = Integer.parseInt(token.nextToken());
            int c = Integer.parseInt(token.nextToken());

            if(a+b+c == 0) break;

            if(isTriangle(a,b,c)){
                System.out.println("right");
            }else {
                System.out.println("wrong");
            }
        }
    }

    public static boolean isTriangle(int a , int b, int c){
        int aa = a * a;
        int bb = b * b;
        int cc = c * c;

        return (aa + bb == cc || aa + cc == bb || bb + cc == aa);

    }
}
