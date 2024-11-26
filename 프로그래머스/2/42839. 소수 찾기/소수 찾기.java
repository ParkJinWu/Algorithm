import java.util.HashSet;
import java.util.Set;

public class Solution {
    static boolean[] visited = new boolean[7];
    static Set<Integer> set = new HashSet<>(); // 중복 제거용 Set

    public int solution(String numbers) {
        //char[] ch = numbers.toCharArray();
        String[] arr = new String[numbers.length()];

        for (int i = 0; i < numbers.length(); i++) {
            arr[i] = String.valueOf(numbers.charAt(i));
        }

        dfs(numbers,"",0);

        int cnt = 0;
        for (int n : set){
            if(isPrime(n)) cnt++;
        }


        return cnt;
    }

    private static void dfs(String numbers, String now, int depth){
        if(depth == numbers.length()) return;

        for (int i = 0; i < numbers.length(); i++) {
            if(!visited[i]){
                visited[i] = true; // 방문 표시
                set.add(Integer.parseInt(now + numbers.charAt(i)));
                dfs(numbers,now + numbers.charAt(i), depth+1); //현재 숫자 추가
                visited[i] = false;
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        // 에라토스테네스 체
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        //String numbers = "17";
        String numbers = "011";
        System.out.println(sol.solution(numbers));
    }
}
