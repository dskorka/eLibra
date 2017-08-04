package infrastructure.persistence;

import application.book.BookProjection;
import application.book.BookProjectionRepo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Damian on 04.08.2017
 */

@Repository
public class JpaBookProjectionRepo implements BookProjectionRepo {

    private final JpaDataBookProjectionRepo repo;

    public JpaBookProjectionRepo(JpaDataBookProjectionRepo repo) {
        this.repo = repo;
    }

    public List<BookProjection> getNewBookProjectionItems() {
        return repo.findAll();
    }
}
