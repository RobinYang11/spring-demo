package com.robin.demoproject.bean;

public class RoomBean {
    private long id;

    private String name;

    private int room;

    private int tid;

    public int getUid() {
        return tid;
    }

    public void setUid(int tid) {
        this.tid = tid;
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

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }
}
