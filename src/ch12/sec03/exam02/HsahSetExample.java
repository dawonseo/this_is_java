package ch12.sec03.exam02;

import java.util.HashSet;

public class HsahSetExample {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();

        Student s1 = new Student(1, "홍길동");
        hashSet.add(s1);
        System.out.println("저장된 객체 수: " + hashSet.size());

        // 동등 객체는 중복 저장되지 않음
        // hashCode()를 재정의하지 않으면 객체 번지로 해시코드 생성하므로 다른 객체일 경우 해시도크도 달라진다.
        Student s2 = new Student(1, "홍길동");
        hashSet.add(s2);
        System.out.println("저장된 객체 수: " + hashSet.size());

        Student s3 = new Student(2, "홍길동");
        hashSet.add(s3);
        System.out.println("저장된 객체 수: " + hashSet.size());
    }
}
