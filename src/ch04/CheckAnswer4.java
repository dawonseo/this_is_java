package ch04;

public class CheckAnswer4 {
    public static void main(String[] args) {
        while (true) {
            int diceNumber1 = (int)(Math.random() * 6) + 1;
            int diceNumber2 = (int)(Math.random() * 6) + 1;
            System.out.println("(" + diceNumber1 + ", " + diceNumber2 + ")");

            if ((diceNumber1 + diceNumber2) == 5) {
                System.out.println("종료합니다.");
                break;
            }
        }
    }
}
