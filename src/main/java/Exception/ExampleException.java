package Exception;

public class ExampleException extends  Exception {
    public String message;

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
