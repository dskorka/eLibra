package infrastructure.persistence;

import application.article.ArticleProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Damian on 02.08.2017
 */

@Repository
public interface JpaDataArticleProjectionRepo extends JpaRepository<ArticleProjection, Long> {


}
