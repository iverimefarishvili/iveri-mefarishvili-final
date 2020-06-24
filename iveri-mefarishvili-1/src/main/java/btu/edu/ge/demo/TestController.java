package btu.edu.ge.demo;

import btu.edu.ge.demo.repository.AttachmentRepository;
import btu.edu.ge.demo.repository.AuthorRepository;
import btu.edu.ge.demo.repository.BookRepository;
import btu.edu.ge.demo.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    AttachmentRepository attachmentRepository;

    @Autowired
    AuthorRepository authorRepository;

    @Autowired
    BookRepository bookRepository;

    @Autowired
    TagRepository tagRepository;
}
