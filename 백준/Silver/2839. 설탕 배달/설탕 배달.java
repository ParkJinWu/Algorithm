import java.util.Scanner;

public class Main {
    // 설탕 배달
    // 정확하게 N kg 배달
    // 최대한 적은 개수의 봉지
    // 봉지 : 2kg, 5kg
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sugar = sc.nextInt();
        int cnt = 0;


        while(sugar >= 0){
            if(sugar % 5 == 0){
                cnt += sugar / 5;
                System.out.println(cnt);
                return;
            }
            sugar-=3;
            cnt++;
        }

        System.out.println(-1);
    }
}
