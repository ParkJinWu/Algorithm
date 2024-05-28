import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.SortedMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine(), " ");

        // 각 월의 일 수
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // 요일 배열: 월요일부터 시작
        String[] daysOfWeek = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

        int month = Integer.parseInt(token.nextToken());
        int day = Integer.parseInt(token.nextToken());

        int totalDays = 0 ;

        for(int i = 0 ; i < month -1 ; i++){
            totalDays += daysInMonth[i];
        }

        totalDays += day; //입력된 날짜까지 더한다

        System.out.println(daysOfWeek[(totalDays-1) % 7]); 
    }
}
