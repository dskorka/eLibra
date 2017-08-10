package application.book.dto;

import javax.persistence.*;

/**
 * Created by Damian on 29.07.2017
 */

@Entity
@Table(name = "book")
public class BookProjection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "bookRentStatus")
    @Enumerated(EnumType.STRING)
    private BookRentStatus bookRentStatus;

    @Column(name = "imageSrc")
    private String imageSrc;

    protected BookProjection() {
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public BookRentStatus getBookRentStatus() {
        return bookRentStatus;
    }

    public String getImageSrc() {
        return imageSrc;
    }
}
