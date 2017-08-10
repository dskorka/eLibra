package infrastructure.config.domain;

import application.article.service.ArticleProjectionService;
import application.book.service.BookProjectionService;
import application.dashboardPage.service.DashboardPageService;
import application.dashboardPage.service.DashboardPageServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Damian on 29.07.2017
 */

@Configuration
public class DashboardPageConfig {

    @Bean
    public DashboardPageService dashboardPageService(ArticleProjectionService articleProjectionService,
                                                     BookProjectionService bookProjectionService){

        return new DashboardPageServiceImpl(articleProjectionService,bookProjectionService);
    }
}
