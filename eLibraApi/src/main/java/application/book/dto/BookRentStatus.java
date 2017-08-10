package application.book.dto;

enum BookRentStatus {

    FREE(1, "Na półce"),
    RENT(2, "Wypożyczona");

    private int id;
    private String status;

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
