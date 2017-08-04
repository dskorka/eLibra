package infrastructure.persistence;

import application.article.ArticleProjection;
import application.article.ArticleProjectionRepo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Damian on 02.08.2017
 */

@Repository
public class JpaArticleProjectionRepo implements ArticleProjectionRepo {

    private final JpaDataArticleProjectionRepo repo;

    public JpaArticleProjectionRepo(JpaDataArticleProjectionRepo repo) {
       this.repo = repo;
    }

    public List<ArticleProjection> getNewArticleProjection() {
        return repo.findAll();
    }
}
