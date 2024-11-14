import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 부분 문자열
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();  // 텍스트
        String P = br.readLine();  // 패턴

        // pi 배열 계산
        int[] pi = pi_array(P);

        // pi 배열 출력
        //System.out.println("pi 배열: " + Arrays.toString(pi));

        // KMP 알고리즘을 이용해 S에서 P를 찾기
        if (KMP(S, P, pi)) {
            System.out.println(1);  // P가 S에 포함되면 1 출력
        } else {
            System.out.println(0);  // P가 S에 포함되지 않으면 0 출력
        }
    }

    // KMP 알고리즘으로 S에서 P를 찾는 함수
    private static boolean KMP(String S, String P, int[] pi) {
        int m = S.length();
        int n = P.length();
        int j = 0;  // P의 인덱스

        // S에서 P를 찾기
        for (int i = 0; i < m; i++) {
            while (j > 0 && S.charAt(i) != P.charAt(j)) {
                // 일치하지 않으면, pi 배열을 통해 j를 줄여가며 일치하는 위치 찾기
                j = pi[j - 1];
            }

            if (S.charAt(i) == P.charAt(j)) {
                j++;  // 일치하면 j 증가

                // P의 끝까지 일치하면 1을 반환 (찾은 경우)
                if (j == n) {
                    return true;
                }
            }
        }

        // 끝까지 못 찾으면 false 반환
        return false;
    }

    // pi 배열을 계산하는 함수
    private static int[] pi_array(String pattern) {
        int[] pi = new int[pattern.length()];
        int len = 0;

        // pattern에 대한 pi 배열 계산
        for (int i = 1; i < pattern.length(); i++) {
            while (len > 0 && pattern.charAt(i) != pattern.charAt(len)) {
                len = pi[len - 1];  // 일치하지 않으면, 이전 접두사의 길이로 이동
            }

            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;  // 일치하면 길이를 증가
                pi[i] = len;
            }
        }

        return pi;  // 계산된 pi 배열 반환
    }
}
