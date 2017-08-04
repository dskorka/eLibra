package application.dashboardPage.service;

import application.article.service.ArticleProjectionService;
import application.dashboardPage.DashboardPageProjection;
import org.springframework.stereotype.Service;

/**
 * Created by Damian on 27.07.2017
 */

@Service
public class DashboardPageServiceImpl implements DashboardPageService {

    private final ArticleProjectionService articleProjectionService;

    public DashboardPageServiceImpl(ArticleProjectionService articleProjectionService) {
        this.articleProjectionService = articleProjectionService;
    }


    public DashboardPageProjection getDashboardProjection() {
       return new DashboardPageProjection(
                articleProjectionService.getFiveNewArticleProjection(),
                null
        );
    }
}
