import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int[] arr = new int[8];

        boolean ascending = true;
        boolean decending = true;

        for(int i = 0 ; i < arr.length; i++){
            arr[i] = Integer.parseInt(input[i]);
        }

        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] > arr[i-1]) decending = false;
            else if (arr[i-1] > arr[i]) ascending = false;
        }

        if(ascending) System.out.print("ascending");
        else if (decending) System.out.print("descending");
        else System.out.print("mixed");
    }
}
