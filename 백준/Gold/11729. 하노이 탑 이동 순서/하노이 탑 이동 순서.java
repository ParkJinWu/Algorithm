import java.util.Scanner;

// 백준 - 하노이 탑 이동 순서
// 한 번에 한 개의 원판만을 다른 탑으로 옮길 수 있다.
// 쌓아 놓은 원판은 항상 위의 것이 아래의 것보다 작아야 한다
public class Main {
    static StringBuilder sb = new StringBuilder();

    private static void hanoi(int start, int end, int tmp, int cnt){
        // cnt == 1이면 가장 큰 값을 옮길 수 있다.
        if(cnt == 1){
            sb.append(start).append(" ").append(end).append("\n"); // move
            return;
        }

        // n-1 까지 임시로 move
        hanoi(start,tmp,end,cnt - 1);

        sb.append(start).append(" ").append(end).append("\n"); // move

        //
        hanoi(tmp,end,start,cnt - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();

        hanoi(1,3,2, K);

        System.out.println((int)Math.pow(2,K)-1);
        System.out.println(sb.toString());
    }

}
