package ch06;

public class CheckAnswer {
    public static void main(String[] args) {
        Printer.println(10);
        Printer.println(true);
        Printer.println(5.7);
        Printer.println("홍길동");

        ShopService obj1 = ShopService.getInstance();
        ShopService obj2 = ShopService.getInstance();

        if (obj1 == obj2) {
            System.out.println("같은 ShopService 객체입니다.");
        } else {
            System.out.println("다른 ShopService 객체입니다.");
        }
    }

}