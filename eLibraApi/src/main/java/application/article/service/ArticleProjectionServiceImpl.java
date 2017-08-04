package application.article.service;

import application.article.ArticleProjection;
import application.article.ArticleProjectionRepo;

import java.util.List;

/**
 * Created by Damian on 02.08.2017
 */


public class ArticleProjectionServiceImpl implements ArticleProjectionService {

    final private ArticleProjectionRepo repo;

    public ArticleProjectionServiceImpl(ArticleProjectionRepo repo) {
        this.repo = repo;
    }

    public List<ArticleProjection> getFiveNewArticleProjection() {
        return repo.getNewArticleProjection();
    }
}
