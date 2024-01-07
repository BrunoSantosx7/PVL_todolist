package com.vibr1bil.todolist;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToDoService {
    private final ToDoRepo repository;

    @Autowired
    public ToDoService(ToDoRepo repository) {
        this.repository = repository;
    }

    public List<ToDoItem> findAll() {
        return repository.findAll();
    }

    public ToDoItem findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public ToDoItem save(ToDoItem item) {
        return repository.save(item);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
