package com.robin.demoproject.ctrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.util.HashMap;
import java.util.Map;

@RestController
public class Test1Api {
    @GetMapping("/Data")
    Object getData() {
        Map map = new HashMap();
        map.put("name", "ygh");
        map.put("age", 21);
        map.put("id",12345);
        return map;
    }
}
