package com.gzsll.hupu.support.storage.bean;

import java.io.Serializable;


public class ThreadReplyItem implements Serializable {


    private long id;
    private int pid;
    private String create_at;
    private String formatTime;
    private int lights;
    private int floor;
    private int isLight;
    private int groupThreadId;
    private UserInfo userInfo;
    private int addtime;
    private MiniReplyList miniReplyList;
    private String content;
    private boolean isHot;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }



    public String getFormatTime() {
        return formatTime;
    }

    public void setFormatTime(String formatTime) {
        this.formatTime = formatTime;
    }

    public int getLights() {
        return lights;
    }

    public void setLights(int lights) {
        this.lights = lights;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getIsLight() {
        return isLight;
    }

    public void setIsLight(int isLight) {
        this.isLight = isLight;
    }

    public int getGroupThreadId() {
        return groupThreadId;
    }

    public void setGroupThreadId(int groupThreadId) {
        this.groupThreadId = groupThreadId;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public int getAddtime() {
        return addtime;
    }

    public void setAddtime(int addtime) {
        this.addtime = addtime;
    }

    public MiniReplyList getMiniReplyList() {
        return miniReplyList;
    }

    public void setMiniReplyList(MiniReplyList miniReplyList) {
        this.miniReplyList = miniReplyList;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isHot() {
        return isHot;
    }

    public void setIsHot(boolean isHot) {
        this.isHot = isHot;
    }

    public String getCreate_at() {
        return create_at;
    }

    public void setCreate_at(String create_at) {
        this.create_at = create_at;
    }
}