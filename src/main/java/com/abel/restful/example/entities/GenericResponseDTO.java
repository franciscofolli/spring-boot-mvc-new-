package com.abel.restful.example.entities;

public class GenericResponseDTO {

    private GenericErrorDTO error;
    private Integer statusCode = 200;
    private Object data;
    
    public GenericErrorDTO getError() {
        return error;
    }

    public void setError(GenericErrorDTO error) {
        this.error = error;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    
}
