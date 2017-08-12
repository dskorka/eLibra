package infrastructure.config.domain;

import application.article.dto.ArticleProjectionFinder;
import application.article.service.ArticleProjectionService;
import application.article.service.ArticleProjectionServiceImpl;
import infrastructure.persistence.article.ArticleProjectionFinderImpl;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Damian on 02.08.2017
 */

@Configuration
class ArticleConfig {

    @Bean
    ArticleProjectionService articleProjectionService(){
        return new ArticleProjectionServiceImpl();
    }

    @Bean
    ArticleProjectionFinder articleProjectionFinder(@Qualifier("dsl") DSLContext jooqRepository){
        return new ArticleProjectionFinderImpl(jooqRepository);
    }
}