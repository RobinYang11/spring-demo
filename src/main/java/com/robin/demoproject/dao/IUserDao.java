package com.robin.demoproject.dao;

import com.robin.demoproject.bean.UserBean;
import com.robin.demoproject.dto.UserParamDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IUserDao {

    void addUser(UserBean user);

    List<UserBean> queryUser(UserParamDto user);

    void updateUser(UserBean user);

    void deleteUser(UserBean user);

    int countTotal();
}
