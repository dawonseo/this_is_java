package ch05;

public class CheckAnswer7 {
    public static void main(String[] args) {
        int[] array = { 1, 5, 3, 8, 2 };
        int m = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > m) {
                m = array[i];
            }
        }

        System.out.println(m);
    }
}
