/*Step 4: Create a REST Controller Now, create a REST controller to define the API endpoints.
Create a TaskController class:This controller defines endpoints for listing all tasks, retrieving
a task by ID, creating a new task, updating an existing task, and deleting a task. It uses the
TaskRepository to interact with the database.
*/

package com.example.employee.controller;

import com.example.employee.repository.TaskRepository;
import com.example.employee.model.TaskModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/mytable")
public class TaskController {
    @Autowired
    private TaskRepository repository;

    @GetMapping
    public List<TaskModel> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public TaskModel create(@RequestBody TaskModel myTask) {
        return repository.save(myTask);
    }
    @PostMapping("/mock-employees")
    public void createMockEmployees() {
        List<TaskModel> mockEmployees = List.of(
                new TaskModel(null, "1", "John Doe"),
                new TaskModel(null, "2", "Jane Smith"),
                new TaskModel(null, "3", "Alice Johnson"),
                new TaskModel(null, "4", "Bob Brown")
        );
        repository.saveAll(mockEmployees);
    }
}
