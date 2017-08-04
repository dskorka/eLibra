package infrastructure.web;

import application.dashboardPage.DashboardPageProjection;
import application.dashboardPage.service.DashboardPageService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Damian on 29.07.2017
 */

@RestController
public class DashboardPageController {

    private final DashboardPageService service;

    public DashboardPageController(DashboardPageService service) {
        this.service = service;
    }

    @RequestMapping(value = "/")
    public DashboardPageProjection getDashboardViewProjection(){

        return service.getDashboardProjection();
    }
}
