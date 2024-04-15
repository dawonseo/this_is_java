package ch12;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CheckAnswer16 {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분");
        System.out.println(formatter.format(new Date()));
    }
}
