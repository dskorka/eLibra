package infrastructure.persistence.article;

import application.article.dto.ArticleProjection;
import application.article.dto.ArticleProjectionFinder;
import org.jooq.DSLContext;
import org.jooq.Record4;
import org.jooq.Result;
import org.jooq.SelectConditionStep;

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
        Result<Record4<Object, Object, Object, Object>> articles = findArticles();
        return getArticlesList(articles);
    }

    @Override
    public List<ArticleProjection> findArticlesByContent(String searchedContent) {
        SelectConditionStep<Record4<Object, Object, Object, Object>> articles = getArticleListByContent(searchedContent);
        return getArticleList(articles);
    }


    private List<ArticleProjection> getArticleList(SelectConditionStep<Record4<Object, Object, Object, Object>> articles) {
        return articles.stream()
                .map(t ->
                        ArticleProjection.of(
                                t.getValue("article.id", Long.class),
                                t.getValue("article.title", String.class),
                                t.getValue("article.description", String.class).substring(100) + "...",
                                t.getValue("article.imageSrc", String.class))
                )
                .collect(Collectors.toList());
    }


    private List<ArticleProjection> getArticlesList(Result<Record4<Object, Object, Object, Object>> articles) {
        return articles.stream()
                .map(t ->
                        ArticleProjection.of(
                                t.getValue("article.id", Long.class),
                                t.getValue("article.title", String.class),
                                t.getValue("article.description", String.class).substring(100) + "...",
                                t.getValue("article.imageSrc", String.class))
                )
                .collect(Collectors.toList());
    }

    private SelectConditionStep<Record4<Object, Object, Object, Object>> getArticleListByContent(String searchedContent) {
        return jooqRepository.select(
                    field("article.id"),
                    field("article.title"),
                    field("article.description"),
                    field("article.imageSrc"))
                .from(table("article"))
                .where(field("article.description").likeIgnoreCase(searchedContent));
    }

    private Result<Record4<Object, Object, Object, Object>> findArticles() {
        return jooqRepository
                .select(field("article.id"),
                        field("article.title"),
                        field("article.description"),
                        field("article.imageSrc"))
                .from(table("article"))
                .orderBy(field("article.publicationDate").desc())
                .limit(7)
                .fetch();
    }
}