package application.article;

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
    @JsonView
    private Long articleId;

    @Column(name = "title")
    @JsonView
    private String title;

    @Column(name = "shortDescription")
    @JsonView
    private String shortDescription;

    @Column(name = "imageSrc")
    @JsonView
    private String imageSrc;

    protected ArticleProjection() { }

}
