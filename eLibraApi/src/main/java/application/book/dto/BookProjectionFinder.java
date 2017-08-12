package application.book.dto;

import application.book.dto.BookProjection;

import java.util.List;

/**
 * Created by Damian on 12.08.2017
 */


public interface BookProjectionFinder {
    List<BookProjection> findFiveLatestBooks();
}
