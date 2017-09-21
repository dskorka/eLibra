package application.article.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Damian on 29.07.2017
 */
public class ArticleProjection {

    @JsonProperty
    private Long articleId;

    @JsonProperty
    private String title;

    @JsonProperty
    private String shortDescription;

    @JsonProperty
    private String imageSrc;

    private ArticleProjection(Long articleId, String title, String shortDescription, String imageSrc) {
        this.articleId = articleId;
        this.title = title;
        this.shortDescription = shortDescription;
        this.imageSrc = imageSrc;
    }

    public static ArticleProjection of(Long articleId, String title, String shortDescription, String imageSrc) {
        return new ArticleProjection(articleId, title, shortDescription, imageSrc);
    }
}