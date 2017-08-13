package infrastructure.web.book;

import application.book.dto.BookProjection;
import application.book.dto.BookProjectionFinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Damian on 12.08.2017
 */

@RestController
class BookProjectionController {

    private final BookProjectionFinder bookFinder;

    BookProjectionController(BookProjectionFinder bookFinder) {
        this.bookFinder = bookFinder;
    }

    @GetMapping("/findFiveLastestBooks")
    List<BookProjection> getFiveLatestBooks() {
        return bookFinder.findFiveLatestBooks();
    }
}