package com.ugurer.TodoWithReact.service;

import com.ugurer.TodoWithReact.model.Todo;

import java.util.List;

import org.springframework.stereotype.Service;


@Service
public abstract class TodoService {

    public abstract Todo addTodo(Todo todo);
    public abstract void updateTodo(Todo todo);
    public abstract void deleteTodo(Todo todo);
    public abstract Todo getTodo(Integer id);
    public abstract List<Todo> getAllTodos();


}
