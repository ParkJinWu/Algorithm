import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 해시맵 생성
        Map<String, Integer> colorValue = new HashMap<>();
        Map<String, Integer> colorX = new HashMap<>();

        String[] colors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

        for(int i = 0 ; i < colors.length ; i++){
            colorValue.put(colors[i],i);
            colorX.put(colors[i],(int)Math.pow(10,i));
        }

        String color1 = br.readLine();
        String color2 = br.readLine();
        String color3 = br.readLine();

        int value = colorValue.get(color1) * 10 + colorValue.get(color2);
        int mult = colorX.get(color3); // 곱
        System.out.println(value * (long)mult);





    }
}
