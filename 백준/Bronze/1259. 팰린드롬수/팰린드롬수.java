import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String str = br.readLine();
            if(str.equals("0")) break;

            String reverseStr = "";

            for(int i = str.length()-1 ; i >= 0 ; i--) {
                reverseStr += str.charAt(i);
            }
            
            StringBuilder sb = new StringBuilder(str);

            if(str.equals(sb.reverse().toString())){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }

        }
    }
}
