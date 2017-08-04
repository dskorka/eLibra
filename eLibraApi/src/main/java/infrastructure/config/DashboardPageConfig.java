package infrastructure.config;

import application.article.service.ArticleProjectionService;
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
    public DashboardPageService dashboardPageService(ArticleProjectionService articleProjectionService){
        return new DashboardPageServiceImpl(articleProjectionService);
    }
}
