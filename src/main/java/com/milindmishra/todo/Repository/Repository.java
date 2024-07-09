package com.milindmishra.todo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.milindmishra.todo.Entity.Todo;

public interface Repository extends JpaRepository<Todo, Integer>{
}