package application.book.service;

import application.book.dto.BookProjection;
import infrastructure.persistence.book.JpaBookProjectionRepo;

import java.util.List;

/**
 * Created by Damian on 04.08.2017
 */

public class BookProjectionServiceImpl implements BookProjectionService {

    private final JpaBookProjectionRepo bookProjectionRepo;

    public BookProjectionServiceImpl(JpaBookProjectionRepo bookProjectionRepo) {
        this.bookProjectionRepo = bookProjectionRepo;
    }

    public List<BookProjection> getNewBookProjectionItems() {
        return bookProjectionRepo.getNewBookProjectionItems();
    }
}