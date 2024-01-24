package br.com.techstore.core.exceptions;

public class BusinessException extends RuntimeException {
    
    public BusinessException(String message) {
        super(message);
    }

}
