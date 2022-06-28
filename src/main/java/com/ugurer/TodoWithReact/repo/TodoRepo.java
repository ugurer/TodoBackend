package com.ugurer.TodoWithReact.repo;

import com.ugurer.TodoWithReact.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepo extends JpaRepository<Todo,Integer> {

}
