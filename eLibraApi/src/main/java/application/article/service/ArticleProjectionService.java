package application.article.service;

import application.article.ArticleProjection;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ArticleProjectionService {

    List<ArticleProjection> getFiveNewArticleProjection();
}
