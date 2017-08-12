package infrastructure.persistence.article;

import application.article.dto.ArticleProjection;
import application.article.dto.ArticleProjectionFinder;
import org.jooq.DSLContext;
import org.jooq.Record4;
import org.jooq.Result;

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

        Result<Record4<Object, Object, String, Object>> articles = findArticles();
        return getArticlesList(articles);
    }

    private List<ArticleProjection> getArticlesList(Result<Record4<Object, Object, String, Object>> articles) {
        return articles.stream()
                .map(t ->
                    new ArticleProjection(
                            t.getValue("Article.id", Long.class),
                            t.getValue("Article.title", String.class),
                            t.getValue("Article.description", String.class) + "...",
                            t.getValue("Article.imageSrc", String.class))
                    )
                .collect(Collectors.toList());
    }

    private Result<Record4<Object, Object, String, Object>> findArticles() {
        return jooqRepository
                .select(field("Article.id"), field("Article.title"),
                        field("Article.description").substring(100),
                        field("Article.imageSrc"))
                .from(table("Article"))
                .orderBy(field("Article.publicationDate").desc())
                .limit(7)
                .fetch();
    }
}