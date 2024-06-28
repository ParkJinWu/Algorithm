import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {
    // 학생 인기도 측정
    // 학생을 좋아하는 내림차순 출력
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer token = new StringTokenizer(br.readLine());

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String student = token.nextToken();
            map.put(student, 0);
        }

        for (int i = 0; i < N; i++) {
            token = new StringTokenizer(br.readLine());

            while (token.hasMoreTokens()) {
                String name = token.nextToken();
                map.put(name, map.getOrDefault(name, 0) + 1);
            }
        }

        // 정렬된 결과 출력
        map.entrySet().stream()
                .sorted((e1, e2) -> {
                    // 인기도 내림차순으로 정렬
                    int compareByPopularity = e2.getValue().compareTo(e1.getValue());
                    // 인기도가 같으면 이름 오름차순으로 정렬
                    return compareByPopularity == 0 ? e1.getKey().compareTo(e2.getKey()) : compareByPopularity;
                })
                .forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
    }
}