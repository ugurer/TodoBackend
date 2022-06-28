package com.ugurer.TodoWithReact.exception;

public class TodoNotFoundExeption extends RuntimeException {

    public TodoNotFoundExeption(Integer id){
        super(String.format("Todo With Id %d Not Found",id));
    }
    
}
