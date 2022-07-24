package com.robin.demoproject.service.impl;

import com.robin.demoproject.bean.RoomBean;
import com.robin.demoproject.dao.IRoomDao;
import com.robin.demoproject.dto.RoomParamDto;
import com.robin.demoproject.dto.UserDto;
import com.robin.demoproject.dto.UserDto1;
import com.robin.demoproject.service.IRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IRoomServiceImpl implements IRoomService {
    @Autowired
    private IRoomDao iRoomDao;

    @Override
    public RoomBean addRoom(RoomBean room){
        iRoomDao.addRoom(room);
        return room;

    }

    @Override
    public List<RoomBean> queryRoom(RoomParamDto room) {
        return iRoomDao.queryRoom(room);
    }

    @Override
    public void updateRoom(RoomBean room) {
        iRoomDao.updateRoom(room);
    }
    @Override
    public void deleteRoom(RoomBean room){
        iRoomDao.deleteRoom(room);
    }

    @Override
    public UserDto1 queryUserRooms(int id) {
        return iRoomDao.queryUserRooms(id);
    }

    @Override
    public int countTotal() {
        return iRoomDao.countTotal();
    }

}
