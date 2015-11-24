package com.gzsll.hupu.support.db;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 

/**
 * Entity mapped to table DBTHREAD_INFO.
 */
public class DBThreadInfo {

    private Long id;
    private Long serverId;
    private Integer uid;
    private Integer lastReplyTime;
    private Integer special;
    private Integer lights;
    private Integer attention;
    private Integer type;
    private Integer zan;
    private Integer digest;
    private Long createAtUnixTime;
    private Integer replies;
    private Long groupId;
    private Long tid;
    private String sharedImg;
    private String username;
    private String createAt;
    private String title;
    private String note;
    private String content;
    private Long userId;
    private Long groupsId;

    public DBThreadInfo() {
    }

    public DBThreadInfo(Long id) {
        this.id = id;
    }

    public DBThreadInfo(Long id, Long serverId, Integer uid, Integer lastReplyTime, Integer special, Integer lights, Integer attention, Integer type, Integer zan, Integer digest, Long createAtUnixTime, Integer replies, Long groupId, Long tid, String sharedImg, String username, String createAt, String title, String note, String content, Long userId, Long groupsId) {
        this.id = id;
        this.serverId = serverId;
        this.uid = uid;
        this.lastReplyTime = lastReplyTime;
        this.special = special;
        this.lights = lights;
        this.attention = attention;
        this.type = type;
        this.zan = zan;
        this.digest = digest;
        this.createAtUnixTime = createAtUnixTime;
        this.replies = replies;
        this.groupId = groupId;
        this.tid = tid;
        this.sharedImg = sharedImg;
        this.username = username;
        this.createAt = createAt;
        this.title = title;
        this.note = note;
        this.content = content;
        this.userId = userId;
        this.groupsId = groupsId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getServerId() {
        return serverId;
    }

    public void setServerId(Long serverId) {
        this.serverId = serverId;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getLastReplyTime() {
        return lastReplyTime;
    }

    public void setLastReplyTime(Integer lastReplyTime) {
        this.lastReplyTime = lastReplyTime;
    }

    public Integer getSpecial() {
        return special;
    }

    public void setSpecial(Integer special) {
        this.special = special;
    }

    public Integer getLights() {
        return lights;
    }

    public void setLights(Integer lights) {
        this.lights = lights;
    }

    public Integer getAttention() {
        return attention;
    }

    public void setAttention(Integer attention) {
        this.attention = attention;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getZan() {
        return zan;
    }

    public void setZan(Integer zan) {
        this.zan = zan;
    }

    public Integer getDigest() {
        return digest;
    }

    public void setDigest(Integer digest) {
        this.digest = digest;
    }

    public Long getCreateAtUnixTime() {
        return createAtUnixTime;
    }

    public void setCreateAtUnixTime(Long createAtUnixTime) {
        this.createAtUnixTime = createAtUnixTime;
    }

    public Integer getReplies() {
        return replies;
    }

    public void setReplies(Integer replies) {
        this.replies = replies;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public String getSharedImg() {
        return sharedImg;
    }

    public void setSharedImg(String sharedImg) {
        this.sharedImg = sharedImg;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getGroupsId() {
        return groupsId;
    }

    public void setGroupsId(Long groupsId) {
        this.groupsId = groupsId;
    }

}
