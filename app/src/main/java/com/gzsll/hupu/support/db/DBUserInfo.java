package com.gzsll.hupu.support.db;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 

/**
 * Entity mapped to table DBUSER_INFO.
 */
public class DBUserInfo {

    private Long id;
    private String username;
    private Integer syncTime;
    private Integer uid;
    private String icon;
    private Integer replyNum;
    private Integer postNum;
    private String groups;
    private Integer sex;
    private Integer favoriteNum;
    private Integer level;

    public DBUserInfo() {
    }

    public DBUserInfo(Long id) {
        this.id = id;
    }

    public DBUserInfo(Long id, String username, Integer syncTime, Integer uid, String icon, Integer replyNum, Integer postNum, String groups, Integer sex, Integer favoriteNum, Integer level) {
        this.id = id;
        this.username = username;
        this.syncTime = syncTime;
        this.uid = uid;
        this.icon = icon;
        this.replyNum = replyNum;
        this.postNum = postNum;
        this.groups = groups;
        this.sex = sex;
        this.favoriteNum = favoriteNum;
        this.level = level;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getSyncTime() {
        return syncTime;
    }

    public void setSyncTime(Integer syncTime) {
        this.syncTime = syncTime;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getReplyNum() {
        return replyNum;
    }

    public void setReplyNum(Integer replyNum) {
        this.replyNum = replyNum;
    }

    public Integer getPostNum() {
        return postNum;
    }

    public void setPostNum(Integer postNum) {
        this.postNum = postNum;
    }

    public String getGroups() {
        return groups;
    }

    public void setGroups(String groups) {
        this.groups = groups;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getFavoriteNum() {
        return favoriteNum;
    }

    public void setFavoriteNum(Integer favoriteNum) {
        this.favoriteNum = favoriteNum;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

}
