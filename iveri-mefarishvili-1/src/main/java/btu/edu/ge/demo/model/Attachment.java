package btu.edu.ge.demo.model;

import javax.persistence.*;

@Entity
public class Attachment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String pdfUrl;

    @OneToOne(mappedBy = "attachment", cascade = CascadeType.ALL)
    Book book;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Long getId() {
        return id;
    }

    public String getPdfUrl() {
        return pdfUrl;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPdfUrl(String pdfUrl) {
        this.pdfUrl = pdfUrl;
    }
}
