package infrastructure.persistence.book;

import application.book.dto.BookProjection;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Damian on 04.08.2017
 */


interface JpaDataBookProjectionRepo extends JpaRepository<BookProjection, Long> {
}
