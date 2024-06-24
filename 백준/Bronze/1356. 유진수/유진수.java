import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        boolean flag = false;


        for(int i = 1 ; i < N.length() ; i++){
            String a = N.substring(0,i);
            String b = N.substring(i);


            if(Cal(a) == Cal(b)){
                flag = true;
            }
        }

        System.out.print(flag ? "YES" : "NO");

    }

    public static int Cal(String str){
        int result = 1;
        for(int j = 0 ; j < str.length() ;j++){
            int left = str.charAt(j) - '0';
            result *= left;
        }
        return result;
    }
}
