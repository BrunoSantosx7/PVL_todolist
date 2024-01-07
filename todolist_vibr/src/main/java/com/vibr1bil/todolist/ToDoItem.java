package com.vibr1bil.todolist;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class ToDoItem {

	private Long id;
	private String title;
	private boolean done;
	
	
	public ToDoItem() {
		super();
	}

	public ToDoItem(Long id, String title, boolean done) {
		super();
		this.id = id;
		this.title = title;
		this.done = done;
	}


@Id
@GeneratedValue
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public boolean isDone() {
		return done;
	}



	public void setDone(boolean done) {
		this.done = done;
	}
	
	
	
}
