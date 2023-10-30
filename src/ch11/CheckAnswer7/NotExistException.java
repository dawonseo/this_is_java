package ch11.CheckAnswer7;

public class NotExistException extends Exception {
    public NotExistException() {}
    public NotExistException(String message) {
        super(message);
    }
}
