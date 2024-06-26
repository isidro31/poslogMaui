package cl.maui.poslogMaui.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class OracleCustomException extends Exception{

    public OracleCustomException() {
        super();
    }

    public OracleCustomException(String message) {
        super(message);
    }
    public OracleCustomException(String message, Throwable cause) {
        super(message, cause);
    }

    private HttpStatus status;

    public OracleCustomException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }

}
