package infrastructure.web;

import application.dashboardPage.DashboardPageViewModel;
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
    public DashboardPageViewModel getDashboardViewProjection(){

        return service.getDashboardProjection();
    }
}
