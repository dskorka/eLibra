package application.dashboardPage.dto;

import application.article.dto.ArticleProjection;
import application.book.dto.BookProjection;

import java.util.List;

/**
 * Created by Damian on 29.07.2017
 */

public class DashboardPageViewModel {

    private final List<ArticleProjection> articleProjection;
    private final List<BookProjection> bookProjection;

    public DashboardPageViewModel(List<ArticleProjection> articleProjection, List<BookProjection> bookProjection) {
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
