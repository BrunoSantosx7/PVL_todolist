package com.vibr1bil.todolist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

	@RestController
	@RequestMapping("/items")

public class ToDoController {

	    private final ToDoService service;

	    @Autowired
	    public ToDoController(ToDoService service) {
	        this.service = service;
	    }

	    @GetMapping
	    public List<ToDoItem> getAllItems() {
	        return service.findAll();
	    }

	    @GetMapping("/{id}")
	    public ToDoItem getItem(@PathVariable Long id) {
	        return service.findById(id);
	    }

	    @PostMapping
	    public ToDoItem createItem(@RequestBody ToDoItem item) {
	        return service.save(item);
	    }

	    @PutMapping("/{id}")
	    public ToDoItem updateItem(@PathVariable Long id, @RequestBody ToDoItem item) {
	        return service.save(item);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteItem(@PathVariable Long id) {
	        service.deleteById(id);
	    }
	
}
