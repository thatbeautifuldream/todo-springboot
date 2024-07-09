package com.milindmishra.todo.Service;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import com.milindmishra.todo.Entity.Todo;

@org.springframework.stereotype.Service
public class Service {
  @Autowired
  private Repository Repos; 

    public Todo create(Todo todo) {
        // Todo newTodo = Repos.save(todo);
        Todo newTodo = new Todo();
        newTodo.save(null);
        return newTodo;
    }
}
