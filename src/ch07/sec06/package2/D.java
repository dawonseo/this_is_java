package ch07.sec06.package2;

import ch07.sec06.package1.A;

public class D  extends A {
    // 직접 객체 생성해서 사용하는 것은 안 되고, 상속을 통해서만 사용 가능하다.

    // 생성자 선언
    public D() {
        // A() 생성자 호출
        super();        // o
    }

    // 메소드 선언
    public void method1() {
        // A 필드값 변경
        this.field = "value";   //o
        // A 메소드 호출
        this.method();      // o
    }

    // 메소드 선언
    public void method2() {
//        A a = new A();  // x
//        a.field = "value";  // x
//        a.method(); // x
    }
}
