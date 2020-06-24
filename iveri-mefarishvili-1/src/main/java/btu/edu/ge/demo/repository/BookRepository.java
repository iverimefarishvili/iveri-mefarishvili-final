package btu.edu.ge.demo.repository;

import btu.edu.ge.demo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
