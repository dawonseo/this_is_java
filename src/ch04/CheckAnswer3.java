package ch04;

public class CheckAnswer3 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 3; i <= 100; i += 3) {
            System.out.println(i);
            sum += i;
        }

        System.out.println(sum);
    }
}
