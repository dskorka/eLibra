package infrastructure.config.domain;

import application.book.dto.BookProjectionFinder;
import application.book.service.BookProjectionService;
import application.book.service.BookProjectionServiceImpl;
import infrastructure.persistence.book.BookProjectionFinderImpl;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Damian on 04.08.2017
 */

@Configuration
class BookConfig {

    @Bean
    BookProjectionService bookProjectionService(){
        return new BookProjectionServiceImpl();
    }

    @Bean
    BookProjectionFinder bookProjectionFinder(@Qualifier("dsl") DSLContext jooqRepository){
        return new BookProjectionFinderImpl(jooqRepository);
    }
}
