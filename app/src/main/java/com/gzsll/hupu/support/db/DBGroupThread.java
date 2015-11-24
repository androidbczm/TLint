package com.gzsll.hupu.support.db;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 

/**
 * Entity mapped to table DBGROUP_THREAD.
 */
public class DBGroupThread {

    private Long id;
    private Integer lights;
    private String username;
    private Long createAtUnixTime;
    private String title;
    private String note;
    private Integer replies;
    private Integer tid;
    private Long serverId;
    private Long userId;
    private Long coverId;

    public DBGroupThread() {
    }

    public DBGroupThread(Long id) {
        this.id = id;
    }

    public DBGroupThread(Long id, Integer lights, String username, Long createAtUnixTime, String title, String note, Integer replies, Integer tid, Long serverId, Long userId, Long coverId) {
        this.id = id;
        this.lights = lights;
        this.username = username;
        this.createAtUnixTime = createAtUnixTime;
        this.title = title;
        this.note = note;
        this.replies = replies;
        this.tid = tid;
        this.serverId = serverId;
        this.userId = userId;
        this.coverId = coverId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getLights() {
        return lights;
    }

    public void setLights(Integer lights) {
        this.lights = lights;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getCreateAtUnixTime() {
        return createAtUnixTime;
    }

    public void setCreateAtUnixTime(Long createAtUnixTime) {
        this.createAtUnixTime = createAtUnixTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getReplies() {
        return replies;
    }

    public void setReplies(Integer replies) {
        this.replies = replies;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Long getServerId() {
        return serverId;
    }

    public void setServerId(Long serverId) {
        this.serverId = serverId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getCoverId() {
        return coverId;
    }

    public void setCoverId(Long coverId) {
        this.coverId = coverId;
    }

}
