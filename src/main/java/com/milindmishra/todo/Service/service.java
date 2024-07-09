package com.milindmishra.todo.Service;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import com.milindmishra.todo.Entity.Todo;

@org.springframework.stereotype.Service
public class Service {
  @Autowired
  private Repository repository; 

    public Todo create(Todo todo) {
        // Todo newTodo = Repos.save(todo);
        // Todo newTodo = new Todo(); no need to do this
        // newTodo.save(null); -> this is not a Todo's fn
        repository.save(todo);
        return newTodo;
    }
}
