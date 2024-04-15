package ch12;

import java.nio.charset.StandardCharsets;

public class CheckAnswer9 {
    public static void main(String[] args) {
        byte[] bytes = { -20, -107, -120, -21, -123, -107 };
        String str = new String(bytes, StandardCharsets.UTF_8);
        System.out.println("str: " + str);
    }
}
