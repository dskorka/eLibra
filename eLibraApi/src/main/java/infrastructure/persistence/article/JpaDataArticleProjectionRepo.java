package infrastructure.persistence.article;

import application.article.dto.ArticleProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Damian on 02.08.2017
 */

@Repository
interface JpaDataArticleProjectionRepo extends JpaRepository<ArticleProjection, Long> {


}
