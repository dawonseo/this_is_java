package ch14.sec07.exam02;

public class InterruptExample {
    public static void main(String[] args) {
        Thread thread = new PrintThread();
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }

        // 스레드가 실행 대기/실행 상태일 때에는 interrupt() 메소드가 호출이 되어도 InterruptedException이 발생하지 않는다
        thread.interrupt();
    }
}
