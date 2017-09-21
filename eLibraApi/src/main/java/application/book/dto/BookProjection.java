package application.book.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Damian on 29.07.2017
 */

public class BookProjection {

    @JsonProperty
    private Long id;

    @JsonProperty
    private String title;

    @JsonProperty
    private String author;

    @JsonProperty
    private BookRentStatus bookRentStatus;

    @JsonProperty
    private String imageSrc;

    private BookProjection(Long id, String title, String author, BookRentStatus rentStatus, String imageSrc) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.bookRentStatus = rentStatus;
        this.imageSrc = imageSrc;
    }

    public static BookProjection of(Long id, String title, String author, BookRentStatus rentStatus, String imageSrc) {
        return new BookProjection(id, title, author, rentStatus, imageSrc);
    }
}