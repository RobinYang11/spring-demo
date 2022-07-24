package com.robin.demoproject.service;

import com.robin.demoproject.bean.RoomBean;
import com.robin.demoproject.dto.RoomParamDto;
import com.robin.demoproject.dto.UserDto1;

import java.util.List;

public interface IRoomService {

    RoomBean addRoom(RoomBean room);

    List<RoomBean> queryRoom(RoomParamDto room);

    void updateRoom(RoomBean room);

    void deleteRoom(RoomBean room);

    UserDto1 queryUserRooms(int id);

    int countTotal();

}
