package com.robin.demoproject.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AaController {

    @GetMapping("/aaaa.jsp")
    ModelAndView mm(){
        ModelAndView mm = new ModelAndView();
        mm.addObject("name","robin");
        mm.setViewName("aa");
        return mm;
    }
}
