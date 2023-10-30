package ch11.CheckAnswer8;

import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("file.txt")) {
            fw.write("Java");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
