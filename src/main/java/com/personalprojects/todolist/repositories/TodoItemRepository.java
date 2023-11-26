package com.personalprojects.todolist.repositories;

import org.springframework.data.repository.CrudRepository;
import com.personalprojects.todolist.models.TodoItem;

public interface TodoItemRepository extends CrudRepository<TodoItem, Long>{
    
}
