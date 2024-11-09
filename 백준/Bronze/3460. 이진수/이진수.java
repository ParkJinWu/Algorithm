import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            int num = sc.nextInt();
            String binaryNumber = Integer.toBinaryString(num);
            //System.out.println(Integer.toString(num,2));
            //System.out.println(Integer.toBinaryString(num));
            int idx = 0;
            for (int j = binaryNumber.length()-1; j >= 0 ; j--) {
                if(binaryNumber.charAt(j) == '1'){
                    sb.append(idx).append(" ");
                }
                idx++;
            }
            sb.setLength(sb.length()-1);
            System.out.println(sb.toString());
            sb.setLength(0); // sb초기화
        }
    }
}
