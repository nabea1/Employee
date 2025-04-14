/*Step 3: Create a Repository Create a repository interface to interact with the
H2 database using Spring Data JPA. Create a TaskRepository interface:Spring Data JPA will
provide basic CRUD operations for the Task entity.

*/


package com.example.employee.repository;

import com.example.employee.model.TaskModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<TaskModel, Long> {

}
