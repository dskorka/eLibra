package infrastructure.config;

import application.book.service.BookProjectionService;
import application.book.service.BookProjectionServiceImpl;
import infrastructure.persistence.JpaBookProjectionRepo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Damian on 04.08.2017
 */

@Configuration
public class BookConfig {

    @Bean
    BookProjectionService bookProjectionService(JpaBookProjectionRepo repo){
        return new BookProjectionServiceImpl(repo);
    }
}
