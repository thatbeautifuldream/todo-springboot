package com.milindmishra.todo.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

import com.milindmishra.todo.Entity.Todo;

public class Controller {

  // service se link krne k liye kuch bnaya nhi sir?

  @PostMapping("/create")
  public ResponseEntity<Todo> create(Todo todo) {
    Todo newTodo = new Todo();
    newTodo.setId(1);
    newTodo.setDescription("Learning spring IDK why");
    newTodo.setDone(false);
    newTodo.setTitle("Tehelka Omellete bna diya bhai!!!!!!");
    // newTodo.save(newTodo); not a Todo's class fn will throw error
    // serviceKaAutowiredObj.uskaFn(newTodo); // Dhyan nhi de rhe sir coding me kuch to gadbad h
    return ResponseEntity.ok(newTodo);
  }
}
