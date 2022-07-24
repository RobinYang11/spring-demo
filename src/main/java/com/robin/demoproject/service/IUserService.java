package com.robin.demoproject.service;

import com.robin.demoproject.bean.UserBean;
import com.robin.demoproject.dto.UserParamDto;

import java.util.List;

public interface IUserService {

    UserBean addUser(UserBean user);

    List<UserBean> queryUser(UserParamDto user);

    void updateUser(UserBean user);

    void deleteUser(UserBean user);

    int countTotal();


}
