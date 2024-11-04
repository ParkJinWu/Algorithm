import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String score = br.readLine();
        double gradePoint;

        switch (score) {
            case "A+":
                gradePoint = 4.3;
                break;
            case "A0":
                gradePoint = 4.0;
                break;
            case "A-":
                gradePoint = 3.7;
                break;
            case "B+":
                gradePoint = 3.3;
                break;
            case "B0":
                gradePoint = 3.0;
                break;
            case "B-":
                gradePoint = 2.7;
                break;
            case "C+":
                gradePoint = 2.3;
                break;
            case "C0":
                gradePoint = 2.0;
                break;
            case "C-":
                gradePoint = 1.7;
                break;
            case "D+":
                gradePoint = 1.3;
                break;
            case "D0":
                gradePoint = 1.0;
                break;
            case "D-":
                gradePoint = 0.7;
                break;
            case "F":
                gradePoint = 0.0;
                break;
            default:
                gradePoint = -1; // 잘못된 성적 처리
        }

        System.out.println(gradePoint);

    }
}
