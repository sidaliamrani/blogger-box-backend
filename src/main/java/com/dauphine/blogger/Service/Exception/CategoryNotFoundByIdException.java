package com.dauphine.blogger.Service.Exception;

public class CategoryNotFoundByIdException extends RuntimeException {
    public CategoryNotFoundByIdException(String message) {
        super(message);
    }
}
