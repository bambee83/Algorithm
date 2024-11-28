import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        // 과목평점 매핑
        HashMap<String, Double> gradeMap = new HashMap<>();
        gradeMap.put("A+", 4.5);
        gradeMap.put("A0", 4.0);
        gradeMap.put("B+", 3.5);
        gradeMap.put("B0", 3.0);
        gradeMap.put("C+", 2.5);
        gradeMap.put("C0", 2.0);
        gradeMap.put("D+", 1.5);
        gradeMap.put("D0", 1.0);
        gradeMap.put("F", 0.0);

        double totalWeightedScore = 0.0; // (학점 × 과목평점)의 합
        double totalCredits = 0.0;       // 학점의 총합

        // 입력 처리
        for (int i = 0; i < 20; i++) {
            String courseName = scanner.next(); // 과목명
            double credit = scanner.nextDouble(); // 학점
            String grade = scanner.next();       // 등급

            if (!grade.equals("P")) { // P(F) 과목은 계산에서 제외
                totalWeightedScore += credit * gradeMap.get(grade); // 학점 × 과목평점
                totalCredits += credit; // 학점 합산
            }
        }

        // 전공평점 계산 및 출력
        double gpa = totalCredits > 0 ? totalWeightedScore / totalCredits : 0.0;
        System.out.printf("%.6f%n", gpa); // 소수점 6자리까지 출력
    }
}
