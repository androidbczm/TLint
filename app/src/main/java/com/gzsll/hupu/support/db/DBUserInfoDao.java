package com.gzsll.hupu.support.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * DAO for table DBUSER_INFO.
 */
public class DBUserInfoDao extends AbstractDao<DBUserInfo, Long> {

    public static final String TABLENAME = "DBUSER_INFO";

    /**
     * Properties of entity DBUserInfo.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Username = new Property(1, String.class, "username", false, "USERNAME");
        public final static Property SyncTime = new Property(2, Integer.class, "syncTime", false, "SYNC_TIME");
        public final static Property Uid = new Property(3, Integer.class, "uid", false, "UID");
        public final static Property Icon = new Property(4, String.class, "icon", false, "ICON");
        public final static Property ReplyNum = new Property(5, Integer.class, "replyNum", false, "REPLY_NUM");
        public final static Property PostNum = new Property(6, Integer.class, "postNum", false, "POST_NUM");
        public final static Property Groups = new Property(7, String.class, "groups", false, "GROUPS");
        public final static Property Sex = new Property(8, Integer.class, "sex", false, "SEX");
        public final static Property FavoriteNum = new Property(9, Integer.class, "favoriteNum", false, "FAVORITE_NUM");
        public final static Property Level = new Property(10, Integer.class, "level", false, "LEVEL");
    }

    ;


    public DBUserInfoDao(DaoConfig config) {
        super(config);
    }

    public DBUserInfoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /**
     * Creates the underlying database table.
     */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists ? "IF NOT EXISTS " : "";
        db.execSQL("CREATE TABLE " + constraint + "'DBUSER_INFO' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'USERNAME' TEXT," + // 1: username
                "'SYNC_TIME' INTEGER," + // 2: syncTime
                "'UID' INTEGER," + // 3: uid
                "'ICON' TEXT," + // 4: icon
                "'REPLY_NUM' INTEGER," + // 5: replyNum
                "'POST_NUM' INTEGER," + // 6: postNum
                "'GROUPS' TEXT," + // 7: groups
                "'SEX' INTEGER," + // 8: sex
                "'FAVORITE_NUM' INTEGER," + // 9: favoriteNum
                "'LEVEL' INTEGER);"); // 10: level
    }

    /**
     * Drops the underlying database table.
     */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'DBUSER_INFO'";
        db.execSQL(sql);
    }

    /**
     * @inheritdoc
     */
    @Override
    protected void bindValues(SQLiteStatement stmt, DBUserInfo entity) {
        stmt.clearBindings();

        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }

        String username = entity.getUsername();
        if (username != null) {
            stmt.bindString(2, username);
        }

        Integer syncTime = entity.getSyncTime();
        if (syncTime != null) {
            stmt.bindLong(3, syncTime);
        }

        Integer uid = entity.getUid();
        if (uid != null) {
            stmt.bindLong(4, uid);
        }

        String icon = entity.getIcon();
        if (icon != null) {
            stmt.bindString(5, icon);
        }

        Integer replyNum = entity.getReplyNum();
        if (replyNum != null) {
            stmt.bindLong(6, replyNum);
        }

        Integer postNum = entity.getPostNum();
        if (postNum != null) {
            stmt.bindLong(7, postNum);
        }

        String groups = entity.getGroups();
        if (groups != null) {
            stmt.bindString(8, groups);
        }

        Integer sex = entity.getSex();
        if (sex != null) {
            stmt.bindLong(9, sex);
        }

        Integer favoriteNum = entity.getFavoriteNum();
        if (favoriteNum != null) {
            stmt.bindLong(10, favoriteNum);
        }

        Integer level = entity.getLevel();
        if (level != null) {
            stmt.bindLong(11, level);
        }
    }

    /**
     * @inheritdoc
     */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }

    /**
     * @inheritdoc
     */
    @Override
    public DBUserInfo readEntity(Cursor cursor, int offset) {
        DBUserInfo entity = new DBUserInfo( //
                cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
                cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // username
                cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // syncTime
                cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3), // uid
                cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // icon
                cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5), // replyNum
                cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6), // postNum
                cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // groups
                cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8), // sex
                cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9), // favoriteNum
                cursor.isNull(offset + 10) ? null : cursor.getInt(offset + 10) // level
        );
        return entity;
    }

    /**
     * @inheritdoc
     */
    @Override
    public void readEntity(Cursor cursor, DBUserInfo entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setUsername(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setSyncTime(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setUid(cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3));
        entity.setIcon(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setReplyNum(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
        entity.setPostNum(cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6));
        entity.setGroups(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setSex(cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8));
        entity.setFavoriteNum(cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9));
        entity.setLevel(cursor.isNull(offset + 10) ? null : cursor.getInt(offset + 10));
    }

    /**
     * @inheritdoc
     */
    @Override
    protected Long updateKeyAfterInsert(DBUserInfo entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }

    /**
     * @inheritdoc
     */
    @Override
    public Long getKey(DBUserInfo entity) {
        if (entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /**
     * @inheritdoc
     */
    @Override
    protected boolean isEntityUpdateable() {
        return true;
    }

}
