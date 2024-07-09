package com.milindmishra.todo.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Todo {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @Column(nullable = false)
  private String title;
  @Column(nullable = true)
  private String description;
  
  @Column(nullable = false)
  private boolean done;

  // getters and setters
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public boolean isDone() {
    return done;
  }

  public void setDone(boolean done) {
    this.done = done;
  }

  // all arg constructor
  public Todo(int id, String title, String description, boolean done) {
    this.id = id;
    this.title = title;
    this.description = description;
    this.done = done;
  }

  // no arg constructor
  public Todo() {
    super();
  }

}
