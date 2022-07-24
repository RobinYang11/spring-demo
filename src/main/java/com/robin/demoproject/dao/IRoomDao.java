package com.robin.demoproject.dao;

import com.robin.demoproject.bean.RoomBean;
import com.robin.demoproject.dto.RoomParamDto;
import com.robin.demoproject.dto.UserDto1;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface IRoomDao {
    void addRoom(RoomBean room);
    List<RoomBean> queryRoom(RoomParamDto room);
    void updateRoom(RoomBean room);
    void deleteRoom(RoomBean room);
    UserDto1 queryUserRooms(@Param("tid")int id);
    int countTotal();


}
