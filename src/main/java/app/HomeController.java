package app;

import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "Welcome to home page";
    }

}
