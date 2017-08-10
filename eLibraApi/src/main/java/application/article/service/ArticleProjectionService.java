package application.article.service;

import application.article.dto.ArticleProjection;

import java.util.List;


public interface ArticleProjectionService {

    List<ArticleProjection> getFiveNewArticleProjection();
}
