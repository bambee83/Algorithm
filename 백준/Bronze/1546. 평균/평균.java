import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 시험 본 과목의 갯수
        double[] scores = new double[N];

        double maxScore = 0;
        for (int i = 0; i < N; i++) {
            scores[i] = sc.nextDouble();
            if (scores[i] > maxScore) {
                maxScore = scores[i];  // 최댓값 갱신
            }
        }
        // 새로운 점수 계산
        double sum = 0; // 변환 점수의 합
        for (int i = 0; i < N; i++) {
            sum += (scores[i] / maxScore) * 100;
        }
        // 새로운 평균 계산
        double newAverage = sum / N;
        System.out.println(newAverage);

    }
}
