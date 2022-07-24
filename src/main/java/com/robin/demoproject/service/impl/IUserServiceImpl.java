package com.robin.demoproject.service.impl;

import com.robin.demoproject.bean.UserBean;
import com.robin.demoproject.dao.IUserDao;
import com.robin.demoproject.dto.UserParamDto;
import com.robin.demoproject.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IUserServiceImpl implements IUserService {

    @Autowired
    private IUserDao iUserDao;

    @Override
    public UserBean addUser(UserBean user) {
        iUserDao.addUser(user);
        return user;
    }

    @Override
    public List<UserBean> queryUser(UserParamDto user) {
        return iUserDao.queryUser(user);
    }

    @Override
    public void updateUser(UserBean user) {
        iUserDao.updateUser(user);
    }
    @Override
    public void deleteUser(UserBean user){
        iUserDao.deleteUser(user);
    }

    @Override
    public int countTotal() {
        return iUserDao.countTotal();
    }
}
