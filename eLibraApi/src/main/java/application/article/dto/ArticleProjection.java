package application.article.dto;

import com.fasterxml.jackson.annotation.JsonView;

import javax.persistence.*;

/**
 * Created by Damian on 29.07.2017
 */

@Entity
@Table(name = "article")
public class ArticleProjection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long articleId;

    @Column(name = "title")
    private String title;

    @Column(name = "shortDescription")
    private String shortDescription;

    @Column(name = "imageSrc")
    private String imageSrc;

    protected ArticleProjection() { }


    public Long getArticleId() {
        return articleId;
    }

    public String getTitle() {
        return title;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getImageSrc() {
        return imageSrc;
    }
}
