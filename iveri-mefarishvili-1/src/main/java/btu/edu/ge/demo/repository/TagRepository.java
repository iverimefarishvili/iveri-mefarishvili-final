package btu.edu.ge.demo.repository;

import btu.edu.ge.demo.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Long> {
}
