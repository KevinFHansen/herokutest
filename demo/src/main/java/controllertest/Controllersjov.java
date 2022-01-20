package controllertest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controllersjov {

    @GetMapping("/")
    public String test(){
        return "index";
    }
}
