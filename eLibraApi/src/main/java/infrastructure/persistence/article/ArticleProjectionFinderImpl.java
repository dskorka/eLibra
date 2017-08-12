package infrastructure.persistence.article;

import application.article.dto.ArticleProjection;
import application.article.dto.ArticleProjectionFinder;
import org.jooq.*;

import java.util.List;
import java.util.stream.Collectors;

import static org.jooq.impl.DSL.field;
import static org.jooq.impl.DSL.table;

/**
 * Created by Damian on 11.08.2017
 */

public class ArticleProjectionFinderImpl implements ArticleProjectionFinder {

    private final DSLContext jooqRepository;

    public ArticleProjectionFinderImpl(DSLContext jooqRepository) {
        this.jooqRepository = jooqRepository;
    }

    public List<ArticleProjection> findFiveLatestArticles() {
        Result<Record4<Object, Object, Object, Object>> articles = jooqRepository
                .select(field("Article.id"), field("Article.title"), field("Article.description"), field("Article.imageSrc"))
                .from(table("Article"))
                .orderBy(field("Article.publicationdate").desc())
                .limit(7)
                .fetch();

        for(Record4<Object, Object, Object, Object> art : articles){

            System.out.println(art.getValue(0));
            System.out.println(art.getValue(3));
        }

        return articles.stream()
                .map(t ->
                    new ArticleProjection(
                            t.getValue("Article.id", Long.class),
                            t.getValue("Article.title", String.class),
                            t.getValue("Article.description", String.class),
                            t.getValue("Article.imageSrc", String.class))
                    )
                .collect(Collectors.toList());
    }
}
