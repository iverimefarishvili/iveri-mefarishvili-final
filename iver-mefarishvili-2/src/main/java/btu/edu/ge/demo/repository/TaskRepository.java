package btu.edu.ge.demo.repository;

import btu.edu.ge.demo.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
