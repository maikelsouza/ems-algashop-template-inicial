package com.algaworks.algashop.template.domain.model;

public class DomainException extends RuntimeException{


    public DomainException(){}

    public DomainException(String message) {
        super(message);
    }

    public DomainException(String message, Throwable cause) {
        super(message, cause);
    }
}
