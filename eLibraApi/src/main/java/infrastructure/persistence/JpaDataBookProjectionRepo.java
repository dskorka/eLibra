package infrastructure.persistence;

import application.book.BookProjection;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Damian on 04.08.2017
 */


public interface JpaDataBookProjectionRepo extends JpaRepository<BookProjection, Long> {
}
