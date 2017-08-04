package application.book;

import com.fasterxml.jackson.annotation.JsonView;

public enum BookRentStatus {

    FREE(1, "Na półce"),
    RENT(2, "Wypożyczona");

    private int id;

    @JsonView
    private String status;

    BookRentStatus(int id, String status) {
        this.id = id;
        this.status = status;
    }
}
