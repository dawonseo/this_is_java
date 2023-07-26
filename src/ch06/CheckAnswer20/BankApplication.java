package ch06.CheckAnswer20;

import java.util.Scanner;

public class BankApplication {
    private static Scanner scanner = new Scanner(System.in);
    private static Account[] accounts = new Account[100];
    private static int cnt = 0;

    public static void main(String[] args) {
        Roof : while (true) {
            System.out.println("-------------------------------------------------");
            System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
            System.out.println("-------------------------------------------------");
            System.out.print("선택> ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> {
                    System.out.println("--------");
                    System.out.println("계좌생성");
                    System.out.println("--------");
                    Account account = new Account();
                    System.out.print("계좌번호: ");
                    account.setAccountNumber(scanner.nextLine());
                    System.out.print("계좌주: ");
                    account.setAccountHolder(scanner.nextLine());
                    System.out.print("초기입금액: ");
                    account.setBalance(Integer.parseInt(scanner.nextLine()));
                    accounts[cnt] = account;
                    cnt++;
                    System.out.println("결과: 계좌가 생성되었습니다.");
                }
                case "2" -> {
                    System.out.println("--------");
                    System.out.println("계좌목록");
                    System.out.println("--------");
                    for (int i = 0; i < cnt; i++) {
                        Account acc = accounts[i];
                        System.out.println(acc.getAccountNumber() + "   " + acc.getAccountHolder() + "  " + acc.getBalance());
                    }
                }
                case "3" -> {
                    System.out.println("--------");
                    System.out.println("예금");
                    System.out.println("--------");
                    System.out.print("계좌번호: ");
                    int idx = findAccount(scanner.nextLine());
                    System.out.print("예금액: ");
                    int current = accounts[idx].getBalance();
                    accounts[idx].setBalance(current + Integer.parseInt(scanner.nextLine()));
                }
                case "4" -> {
                    System.out.println("--------");
                    System.out.println("출금");
                    System.out.println("--------");
                    System.out.print("계좌번호: ");
                    int idx = findAccount(scanner.nextLine());
                    System.out.print("출금액: ");
                    int current = accounts[idx].getBalance();
                    accounts[idx].setBalance(current - Integer.parseInt(scanner.nextLine()));
                }
                case "5" -> {
                    System.out.println("프로그램 종료");
                    break Roof;
                }
            }
        }
    }

    private static int findAccount(String accountNumber) {
        for (int i = 0; i < cnt; i++) {
            Account acc = accounts[i];
            if (acc.getAccountNumber().equals(accountNumber)) {
                return i;
            }
        }
        System.out.println("유효하지 않은 계좌번호입니다.");
        return -1;
    }
}
