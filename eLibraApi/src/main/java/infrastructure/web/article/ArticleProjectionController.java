package infrastructure.web.article;

import application.article.dto.ArticleProjection;
import application.article.dto.ArticleProjectionFinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Damian on 12.08.2017
 */

@RestController
class ArticleProjectionController {

    private final ArticleProjectionFinder articleFinder;

    ArticleProjectionController(ArticleProjectionFinder articleFinder) {
        this.articleFinder = articleFinder;
    }

    @GetMapping("/getArticleProjectionList")
    List<ArticleProjection> getArticleProjectionList() {
        return articleFinder.findFiveLatestArticles();
    }

    @GetMapping("/searchArticlesProjectionByContent")
    List<ArticleProjection> getArticleProjectionByContent(@RequestParam String searchedContent) {
        return articleFinder.findArticlesByContent(searchedContent);
    }
}
