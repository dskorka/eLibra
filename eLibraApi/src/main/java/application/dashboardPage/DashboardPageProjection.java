package application.dashboardPage;

import application.article.ArticleProjection;
import application.book.BookProjection;

import java.util.List;

/**
 * Created by Damian on 29.07.2017
 */


public class DashboardPageProjection{

    private final List<ArticleProjection> articleProjection;
    private final BookProjection bookProjection;

    public DashboardPageProjection(List<ArticleProjection> articleProjection, BookProjection bookProjection) {
        this.articleProjection = articleProjection;
        this.bookProjection = bookProjection;
    }
}
