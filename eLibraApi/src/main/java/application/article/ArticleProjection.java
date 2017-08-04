package application.article;

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

    public ArticleProjection() { }

}
