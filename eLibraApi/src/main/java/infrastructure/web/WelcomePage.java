package infrastructure.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomePage {

    @GetMapping("/")
    public String welcomeUser(){
        return "Welcome in eLibra application!";
    }
}
