package application.article.dto;

import application.article.dto.ArticleProjection;

import java.util.List;

/**
 * Created by Damian on 11.08.2017
 */

public interface ArticleProjectionFinder {

    List<ArticleProjection> findFiveLatestArticles();
}