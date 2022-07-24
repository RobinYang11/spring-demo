package com.robin.demoproject.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Text1Coontroller {
    @GetMapping("/ygh.jsp")
    String ygh(){
        return "ygh";
    }

}
