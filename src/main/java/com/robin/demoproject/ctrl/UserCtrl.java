package com.robin.demoproject.ctrl;

import com.robin.demoproject.bean.BookBean;
import com.robin.demoproject.bean.UserBean;
import com.robin.demoproject.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserCtrl {
    @Autowired
    private IUserService iUserService;

    @GetMapping("user.html")
    String user() {
        return "user";
    }

    @PostMapping("/api/addFormUser")
    String addFormUser(UserBean user){
        iUserService.addUser(user);
        return "user";
    }
}
