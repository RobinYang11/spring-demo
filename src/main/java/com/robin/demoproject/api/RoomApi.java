package com.robin.demoproject.api;

import com.robin.demoproject.bean.RoomBean;
import com.robin.demoproject.bean.UserBean;
import com.robin.demoproject.dto.RoomParamDto;
import com.robin.demoproject.dto.UserDto;
import com.robin.demoproject.dto.UserDto1;
import com.robin.demoproject.dto.UserParamDto;
import com.robin.demoproject.service.IRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class RoomApi {
    @Autowired
    private IRoomService iRoomService;
    @PostMapping("/api/addroom")
    RoomBean addRoom(@RequestBody RoomBean room){
        iRoomService.addRoom(room);
        return room;
    }
//    @GetMapping("/api/queryRoom")
//    List<RoomBean> queryRoom(RoomBean room){
//        List<RoomBean> rooms =iRoomService.queryRoom(room);
//        return rooms;
//    }
    @GetMapping("/api/queryRoom")
    Map queryRoom(RoomParamDto room) {

        room.setPage(room.getPageSize() * (room.getPage() - 1));
        List<RoomBean> rooms = iRoomService.queryRoom(room);
        int total = iRoomService.countTotal();
        Map map = new HashMap();
        map.put("rooms", rooms);
        map.put("total", total);
        return map;
    }
    @PostMapping("/api/updateRoom")
    boolean update(@RequestBody RoomBean room){
        try{
            iRoomService.updateRoom(room);
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }

    }
    @PostMapping("/api/deleteRoom")
    boolean delete(@RequestBody RoomBean room){
        try{
            iRoomService.deleteRoom(room);
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }

    }
    @GetMapping("/api/queryUserRooms")
    UserDto1 select(int id) {
        try {
            return iRoomService.queryUserRooms(id);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }


}

