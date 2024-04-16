package ch13;

public class CheckAnswer2 {
    public static void main(String[] args) {
        Container<String> container1 = new Container<String>();
        container1.set("홍길동");
        String str = container1.get();

        Container<Integer> container2 = new Container<Integer>();
        container2.set(6);
        int value = container2.get();
    }

    public static class Container<T> {
        public T value;

        public Container() {

        }

        public T get() {
            return this.value;
        }

        public void set(T value) {
            this.value = value;
        }
    }
}
