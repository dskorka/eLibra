package application.book;

public enum BookRentStatus {

    FREE(1, "Na półce"),
    RENT(2, "Wypożyczona");

    private int id;

    private String status;

    BookRentStatus(int id, String status) {
        this.id = id;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }
}
