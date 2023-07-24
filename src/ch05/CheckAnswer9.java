package ch05;

import java.util.Scanner;

public class CheckAnswer9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[0];

        A : while (true) {
            System.out.println("-----------------------------------------------------");
            System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("-----------------------------------------------------");
            System.out.print("선택> ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> {
                    System.out.print("학생수> ");
                    int studentCount = Integer.parseInt(scanner.nextLine());
                    scores = new int[studentCount];
                }
                case "2" -> {
                    for (int i = 0; i < scores.length; i++) {
                        System.out.print("scores[" + i + "]>");
                        scores[i] = Integer.parseInt(scanner.nextLine());
                    }
                }
                case "3" -> {
                    for (int i = 0; i < scores.length; i++) {
                        System.out.println("scores[" + i + "]: " + scores[i]);
                    }
                }
                case "4" -> {
                    int m = 0;
                    int totalSum = 0;

                    for (int i = 0; i < scores.length; i++) {
                        if (scores[i] > m) {
                            m = scores[i];
                        }
                        totalSum += scores[i];
                    }

                    System.out.println("최고 점수: " + m);
                    System.out.println("평균 점수: " + (double) totalSum / scores.length);
                }
                case "5" -> {
                    System.out.println("프로그램 종료");
                    break A;
                }
                default -> {
                    System.out.println("잘못된 입력");
                }
            }
        }
    }
}
