package infrastructure.config.domain;

import application.article.repo.ArticleProjectionRepo;
import application.article.service.ArticleProjectionService;
import application.article.service.ArticleProjectionServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Damian on 02.08.2017
 */

@Configuration
public class ArticleConfig {

    @Bean
    ArticleProjectionService articleProjectionService(ArticleProjectionRepo articleProjectionRepo){
        return new ArticleProjectionServiceImpl(articleProjectionRepo);
    }
}
