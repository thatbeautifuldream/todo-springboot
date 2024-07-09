package com.milindmishra.todo.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

import com.milindmishra.todo.Entity.Todo;

public class Controller {
  @PostMapping("/create")
  public ResponseEntity<Todo> create(Todo todo) {
    Todo newTodo = new Todo();
    newTodo.save(newTodo);
    return ResponseEntity.ok(newTodo);
  }
}
