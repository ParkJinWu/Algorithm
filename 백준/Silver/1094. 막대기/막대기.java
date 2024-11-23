import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int stick = 64;
        int cnt = 0;

        while (X > 0){
            if (X >= stick) { // stick이 현재 X보다 작으면 사용
                X -= stick;  // X에서 stick 빼기
                cnt++;        // 사용한 막대기 개수 증가
            }
            stick /= 2;  // stick 길이를 반으로 줄이기

        }
        System.out.println(cnt);


    }
}
