package application.article.repo;

import application.article.dto.ArticleProjection;

import java.util.List;

public interface ArticleProjectionRepo {

    List<ArticleProjection> getNewArticleProjection();
}
