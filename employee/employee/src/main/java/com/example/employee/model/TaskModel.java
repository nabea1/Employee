/*Step 2: Define a Model Create a simple model class to represent the data you want to
expose through your API. For this tutorial, let’s create a TaskModel model.This model uses Lombok’s
@Data annotation for getters, setters, equals, hashCode, and toString methods. It's also annotated
with JPA annotations for database integration.*/


package com.example.employee.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class TaskModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String employeeId;
    private String employeeName;

    // Constructor
    public TaskModel(Long id, String employeeId, String employeeName) {
        this.id = id;
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public TaskModel() {

    }

}



