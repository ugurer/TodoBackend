package com.ugurer.TodoWithReact.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.ugurer.TodoWithReact.model.Todo;
import com.ugurer.TodoWithReact.repo.TodoRepo;
import com.ugurer.TodoWithReact.service.TodoService;
import com.ugurer.TodoWithReact.service.impl.TodoServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class TodoControllerTest {

	@Mock
	private TodoRepo repo;

	private TodoService service;

	@BeforeEach void setUp()
    {
        this.service
            = new TodoServiceImpl(this.repo);
    }
 
	@Test
	public void getAllTodosTest()
	{
		List<Todo> list = new ArrayList<Todo>();
		Todo todoOne = new Todo(1, "Clean Home");
		Todo todoTwo = new Todo(2, "Do Homework");
		Todo todoThree = new Todo(3, "Take Rest");

		list.add(todoOne);
		list.add(todoTwo);
		list.add(todoThree);

		when(repo.findAll()).thenReturn(list);

		//test
		List<Todo> todoList = service.getAllTodos();

		assertEquals(3, todoList.size());
		verify(repo, times(1)).findAll();
	}

	@Test
	public void getEmployeeByIdTest()
	{
		when(repo.getReferenceById(1)).thenReturn(new  Todo(1,"Clean Home"));

		Todo todo = service.getTodo(1);
		assertEquals("Clean Home", todo.getTitle());
	}

	@Test
	public void createEmployeeTest()
	{
		Todo todo = new Todo(1,"Clean Home");

		service.addTodo(todo);

		verify(repo, times(1)).save(todo);
	}

}
