package application.dashboardPage;

import application.article.ArticleProjection;
import application.book.BookProjection;

import java.util.List;

/**
 * Created by Damian on 29.07.2017
 */

public class DashboardPageProjection{

    private final List<ArticleProjection> articleProjection;
    private final List<BookProjection> bookProjection;

    public DashboardPageProjection(List<ArticleProjection> articleProjection, List<BookProjection> bookProjection) {
        this.articleProjection = articleProjection;
        this.bookProjection = bookProjection;
    }

    public List<ArticleProjection> getArticleProjection() {
        return articleProjection;
    }

    public List<BookProjection> getBookProjection() {
        return bookProjection;
    }
}
