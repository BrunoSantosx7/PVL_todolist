package com.vibr1bil.todolist;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepo extends JpaRepository <ToDoItem, Long> {


}
