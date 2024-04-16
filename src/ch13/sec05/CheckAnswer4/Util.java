package ch13.sec05.CheckAnswer4;

public class Util {
    public static <K, V> V getValue(Pair<K, V> pair, K key) {
        if (pair.getKey().equals(key)) {
            return pair.getValue();
        } else {
            return null;
        }
    }
}
