package application.book;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonView;

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
    @JsonView
    private Long id;

    @Column(name = "title")
    @JsonView
    private String title;

    @Column(name = "author")
    @JsonView
    private String author;

    @Column(name = "bookRentStatus")
    @Enumerated(EnumType.STRING)
    @JsonBackReference
    private BookRentStatus bookRentStatus;

    @Column(name = "imageSrc")
    @JsonView
    private String imageSrc;

    protected BookProjection() {
    }
}
