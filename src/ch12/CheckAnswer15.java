package ch12;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CheckAnswer15 {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now().until(LocalDateTime.of(LocalDateTime.now().getYear(), 12, 31, 0, 0, 0), ChronoUnit.DAYS));
    }
}
