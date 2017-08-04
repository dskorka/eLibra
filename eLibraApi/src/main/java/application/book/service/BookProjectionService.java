package application.book.service;

import application.book.BookProjection;

import java.util.List;

public interface BookProjectionService {

    List<BookProjection> getNewBookProjectionItems();
}
