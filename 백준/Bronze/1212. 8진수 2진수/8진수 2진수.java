import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] ch = br.readLine().toCharArray();
        int sum = 0;

        for(int i = 0 ; i < ch.length ; i++){
            int n = ch[i] - '0';
            String binary = Integer.toString(n,2); // 2진수 변환
            
            if(i != 0 && binary.length() == 1){
                binary = "00" + binary;

            } else if (i != 0 && binary.length() == 2){
                binary = "0" + binary;
            }
            sb.append(binary);
        }

        System.out.println(sb);


    }
}
