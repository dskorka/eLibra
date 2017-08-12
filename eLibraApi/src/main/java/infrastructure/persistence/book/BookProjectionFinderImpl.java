package infrastructure.persistence.book;

import application.book.dto.BookProjection;
import application.book.dto.BookRentStatus;
import application.book.dto.BookProjectionFinder;
import org.jooq.DSLContext;
import org.jooq.Record5;
import org.jooq.Result;

import java.util.List;
import java.util.stream.Collectors;

import static org.jooq.impl.DSL.field;

/**
 * Created by Damian on 12.08.2017
 */
public class BookProjectionFinderImpl implements BookProjectionFinder {

    private final DSLContext jooqRepository;

    public BookProjectionFinderImpl(DSLContext jooqRepository) {
        this.jooqRepository = jooqRepository;
    }

    @Override
    public List<BookProjection> findFiveLatestBooks() {

        Result<Record5<Object, Object, Object, Object, Object>> books = findBooks();
        return getBooksList(books);
    }

    private List<BookProjection> getBooksList(Result<Record5<Object, Object, Object, Object, Object>> books) {
        return books.stream()
                .map(t -> new BookProjection(
                    t.getValue("Book.id", Long.class),
                    t.getValue("Book.title", String.class),
                    t.getValue("Article.author", String.class),
                        BookRentStatus.valueOf(t.getValue("Article.bookRentStatus", String.class)),
                        t.getValue("Article.imageSrc", String.class))).
                collect(Collectors.toList());
    }

    private Result<Record5<Object, Object, Object, Object, Object>> findBooks() {
        return jooqRepository
                    .select(field("Book.id"), field("Book.title"),
                            field("Book.author"), field("Book.bookRentStatus"),
                            field("Book.imageSrc"))
                    .from("Book")
                    .orderBy(field("Book.publicationDate").desc())
                    .limit(7)
                    .fetch();
    }
}
