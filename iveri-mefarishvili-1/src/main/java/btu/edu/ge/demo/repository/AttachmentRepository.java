package btu.edu.ge.demo.repository;

import btu.edu.ge.demo.model.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttachmentRepository extends JpaRepository<Attachment, Long> {
}
