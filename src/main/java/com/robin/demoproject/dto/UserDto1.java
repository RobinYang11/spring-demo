package com.robin.demoproject.dto;

import com.robin.demoproject.bean.RoomBean;

import java.util.List;

public class UserDto1 {
    private long id;

    private  String name;

    private  int age;

    private List<RoomBean>rooms;

    public List<RoomBean> getRooms() {
        return rooms;
    }

    public void setRooms(List<RoomBean> rooms) {
        this.rooms = rooms;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
