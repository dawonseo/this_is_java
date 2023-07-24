package ch04;

import java.util.Scanner;

public class CheckAnswer7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int account = 0;

        accountSystem : while(true) {
            System.out.println("--------------------------------");
            System.out.println("1.예금 | 2. 출금 | 3. 잔고 | 4.종료");
            System.out.println("--------------------------------");
            System.out.print("선택> ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> {
                    System.out.print("예금액> ");
                    int depositMoney = Integer.parseInt(scanner.nextLine());
                    account += depositMoney;
                }
                case "2" -> {
                    System.out.print("출금액> ");
                    int withdrawMoney = Integer.parseInt(scanner.nextLine());
                    account -= withdrawMoney;
                }
                case "3" -> {
                    System.out.println("잔고> " + account);
                }
                case "4" -> {
                    System.out.println("프로그램 종료");
                    break accountSystem;
                }
                default -> System.out.println("잘못된 입력입니다.");
            }

        }
    }
}
