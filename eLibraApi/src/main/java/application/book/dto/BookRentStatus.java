package application.book.dto;

public enum BookRentStatus {

    FREE(1, "Na półce"),
    RENT(2, "Wypożyczona");

    private final int id;
    private final String status;

    BookRentStatus(int id, String status) {
        this.id = id;
        this.status = status;
    }

    int getId() {
        return id;
    }

    String getStatus() {
        return status;
    }
}
