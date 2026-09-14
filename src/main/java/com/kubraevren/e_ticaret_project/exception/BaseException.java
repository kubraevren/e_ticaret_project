package com.kubraevren.e_ticaret_project.exception;

public class BaseException extends RuntimeException{
    public BaseException(){

    }

    public BaseException(ErrorMessage errorMessage){
        super(errorMessage.prepareErrorMessage());
    }
}
