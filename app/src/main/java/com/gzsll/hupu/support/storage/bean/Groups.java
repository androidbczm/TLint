package com.gzsll.hupu.support.storage.bean;

import com.amazonaws.com.google.gson.annotations.SerializedName;


public class Groups {


    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(int orderBy) {
        this.orderBy = orderBy;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getGroupAvator() {
        return groupAvator;
    }

    public void setGroupAvator(String groupAvator) {
        this.groupAvator = groupAvator;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getColorStyle() {
        return colorStyle;
    }

    public void setColorStyle(int colorStyle) {
        this.colorStyle = colorStyle;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getGroupArticle() {
        return groupArticle;
    }

    public void setGroupArticle(int groupArticle) {
        this.groupArticle = groupArticle;
    }

    public int getGroupBoardId() {
        return groupBoardId;
    }

    public void setGroupBoardId(int groupBoardId) {
        this.groupBoardId = groupBoardId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }


    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getGroupNote() {
        return groupNote;
    }

    public void setGroupNote(String groupNote) {
        this.groupNote = groupNote;
    }

    public int getGroupMember() {
        return groupMember;
    }

    public void setGroupMember(int groupMember) {
        this.groupMember = groupMember;
    }

    public int getCreateAt() {
        return createAt;
    }

    public void setCreateAt(int createAt) {
        this.createAt = createAt;
    }

    public String getGroupCover() {
        return groupCover;
    }

    public void setGroupCover(String groupCover) {
        this.groupCover = groupCover;
    }

    @SerializedName("id")
    private long serverId;
    private int uid;
    private int orderBy;
    private int categoryId;
    private String groupAvator;
    private String color;
    private int colorStyle;
    private String categoryName;
    private int groupArticle;
    private int groupBoardId;
    private String groupName;
    private int pid;
    private String groupNote;
    private int groupMember;
    private int createAt;
    private String groupCover;


    public long getServerId() {
        return serverId;
    }

    public void setServerId(long serverId) {
        this.serverId = serverId;
    }
}