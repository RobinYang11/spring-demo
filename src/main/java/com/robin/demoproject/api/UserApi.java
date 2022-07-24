package com.robin.demoproject.api;


import com.robin.demoproject.bean.UserBean;
import com.robin.demoproject.dto.UserParamDto;
import com.robin.demoproject.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserApi {

    @Autowired
    private IUserService iUserService;

    @PostMapping("/api/addUser")
    UserBean addUser(@RequestBody UserBean user ) {
        iUserService.addUser(user);
        return user;
    }

    @GetMapping("/api/queryUser")
    Map queryUser(UserParamDto user ,HttpServletRequest request , HttpServletResponse response) {

        System.out.println(request.getQueryString());
        user.setPage(user.getPageSize() * (user.getPage()-1));
        List<UserBean> users = iUserService.queryUser(user);
        int total = iUserService.countTotal();
        Map map =new HashMap();
        map.put("users",users);
        map.put("total",total);
        return map;
    }

    @PostMapping("/api/updateUser")
    boolean update(@RequestBody UserBean user) {
        try {
            iUserService.updateUser(user);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    @PostMapping("/api/deleteUser")
    boolean delete(@RequestBody UserBean user) {
        try {
            iUserService.deleteUser(user);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
