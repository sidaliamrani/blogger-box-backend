package com.dauphine.blogger.Service.Exception;


public class PostNotFoundByIdException extends Exception {
    public PostNotFoundByIdException(String msg) {
        super(msg);
    }
}