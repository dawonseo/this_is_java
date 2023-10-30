package ch11.CheckAnswer7;

public class WrongPasswordException extends Exception {
    public WrongPasswordException() {}
    public WrongPasswordException(String message) {
        super(message);
    }
}
