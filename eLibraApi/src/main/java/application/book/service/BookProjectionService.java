package application.book.service;

import application.book.dto.BookProjection;

import java.util.List;

public interface BookProjectionService {

    List<BookProjection> getNewBookProjectionItems();
}
