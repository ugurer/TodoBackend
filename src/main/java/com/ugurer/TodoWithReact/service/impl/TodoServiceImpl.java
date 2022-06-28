package com.ugurer.TodoWithReact.service.impl;

import com.ugurer.TodoWithReact.model.Todo;
import com.ugurer.TodoWithReact.repo.TodoRepo;
import com.ugurer.TodoWithReact.service.TodoService;
import com.ugurer.TodoWithReact.exception.NoDataFoundException;
import com.ugurer.TodoWithReact.exception.TodoNotFoundExeption;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoServiceImpl extends TodoService {

    @Autowired
    private TodoRepo todoRepo;

    public TodoServiceImpl(TodoRepo todoRepo) {
        this.todoRepo = todoRepo;
    }

    @Override
    public Todo addTodo(Todo todo) {
        return todoRepo.save(todo);
    }

    @Override
    public void updateTodo(Todo todo) {
        todoRepo.save(todo);
    }

    @Override
    public void deleteTodo(Todo todo) {
        todoRepo.delete(todo);
    }

    @Override
    public Todo getTodo(Integer id) {
        Todo todo = todoRepo.getReferenceById(id);
        if (todo == null)
            throw new TodoNotFoundExeption(id);
        return todo;
    }

    @Override
    public List<Todo> getAllTodos() {
        List<Todo> todos = this.todoRepo.findAll();

        if (todos.isEmpty()) {
            throw new NoDataFoundException();
        }
        return todos;
    }
}
