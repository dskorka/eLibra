package application.book.repo;

import application.book.dto.BookProjection;

import java.util.List;

/**
 * Created by Damian on 04.08.2017
 */


public interface BookProjectionRepo {

    List<BookProjection> getNewBookProjectionItems();
}
