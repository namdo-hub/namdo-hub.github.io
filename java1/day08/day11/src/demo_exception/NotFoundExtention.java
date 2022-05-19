package demo_exception;

public class NotFoundExtention extends RuntimeException {
    public NotFoundExtention(String message){
        super(message);
    }

}
