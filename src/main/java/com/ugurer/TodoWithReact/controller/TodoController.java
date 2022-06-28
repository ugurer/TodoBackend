package com.ugurer.TodoWithReact.controller;

import com.ugurer.TodoWithReact.model.Todo;
import com.ugurer.TodoWithReact.service.TodoService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todo")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping("/add")
    public void addTodo(@RequestBody Todo todo) {
        todoService.addTodo(todo);
    }

    @RequestMapping("/update")
    public void updateTodo(@RequestBody Todo todo) {
        todoService.updateTodo(todo);
    }

    @RequestMapping("/delete")
    public void deleteTodo(@RequestBody Todo todo) {
        todoService.deleteTodo(todo);
    }

    @RequestMapping("/get")
    public Todo getTodo(@PathVariable Integer id) {
        return todoService.getTodo(id);
    }

    @RequestMapping("/getAll")
    public Iterable<Todo> getAllTodos() {
        return todoService.getAllTodos();
    }


}


