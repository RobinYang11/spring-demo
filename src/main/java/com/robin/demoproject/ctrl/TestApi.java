package com.robin.demoproject.ctrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController  // 返回json数据
public class TestApi {


    @GetMapping("/getData")
    Object getData(){

        Map map = new HashMap();
        map.put("name", "robin");
        map.put("age",33);
        return map;
    }

}
