package pl.edu.vistula.firstrestapispring.product.support;



import java.time.LocalDateTime;

public class ErrorMessageResponse {
    private final String message;
    private final LocalDateTime timestamp;

    public ErrorMessageResponse(String message) {
        this.message = message;
        this.timestamp = LocalDateTime.now();
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}