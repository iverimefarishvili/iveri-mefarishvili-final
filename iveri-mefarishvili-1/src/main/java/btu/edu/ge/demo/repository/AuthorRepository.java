package btu.edu.ge.demo.repository;

import btu.edu.ge.demo.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
