package application.dashboardPage.service;

import application.article.service.ArticleProjectionService;
import application.book.service.BookProjectionService;
import application.dashboardPage.DashboardPageProjection;
import org.springframework.stereotype.Service;

/**
 * Created by Damian on 27.07.2017
 */

@Service
public class DashboardPageServiceImpl implements DashboardPageService {

    private final ArticleProjectionService articleProjectionService;
    private final BookProjectionService bookProjectionService;

    public DashboardPageServiceImpl(ArticleProjectionService articleProjectionService,
                                    BookProjectionService bookProjectionService) {

        this.articleProjectionService = articleProjectionService;
        this.bookProjectionService = bookProjectionService;
    }


    public DashboardPageProjection getDashboardProjection() {
       return new DashboardPageProjection(
                articleProjectionService.getFiveNewArticleProjection(),
               bookProjectionService.getNewBookProjectionItems()
        );
    }
}