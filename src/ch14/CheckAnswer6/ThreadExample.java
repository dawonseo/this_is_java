package ch14.CheckAnswer6;

import ch14.CheckAnswer2.MovieThread;

public class ThreadExample {
    public static void main(String[] args) {
        Thread thread = new MovieThread();
        thread.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }

        thread.interrupt();
    }

}
