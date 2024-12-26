import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 터렛
// x1, y1, r1, x2, y2, r2,
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer token = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(token.nextToken());
            int y1 = Integer.parseInt(token.nextToken());
            int r1 = Integer.parseInt(token.nextToken());
            int x2 = Integer.parseInt(token.nextToken());
            int y2 = Integer.parseInt(token.nextToken());
            int r2 = Integer.parseInt(token.nextToken());

            double distance = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));

            int sum = r1 + r2;
            int sub = Math.abs(r1-r2);
            System.out.println(getPosition(distance, sum, sub, r1, r2));
        }
    }

    public static int getPosition(double distance, int sum, int sub, int r1, int r2) {
        if (distance == 0 && r1 == r2) {
            return -1; // 동일한 원
        } else if (distance > sum) {
            return 0; // 두 원이 만나지 않음
        } else if (distance < sub) {
            return 0; // 한 원이 다른 원 내부에 있음
        } else if (distance == sum) {
            return 1; // 외접
        } else if (distance == sub) {
            return 1; // 내접
        } else {
            return 2; // 두 점에서 만남
        }
    }
}
