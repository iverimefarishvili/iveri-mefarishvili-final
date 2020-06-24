package btu.edu.ge.demo.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;

    @OneToOne(cascade = CascadeType.ALL)
    Attachment attachment;


    @ManyToMany(cascade = CascadeType.ALL)
    List<Author> authors = new ArrayList<>();

    @OneToMany(mappedBy = "book",cascade = CascadeType.ALL)
        List<Tag> tags = new ArrayList<>();

    public Attachment getAttachment() {
        return attachment;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
