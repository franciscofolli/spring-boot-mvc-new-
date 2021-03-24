package com.abel.restful.example.entities;

public class GenericErrorDTO {

    public static final String GENERIC_ERROR = "Ocorreu um erro inesperado!";
    private String message = GENERIC_ERROR;
    

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    

}
