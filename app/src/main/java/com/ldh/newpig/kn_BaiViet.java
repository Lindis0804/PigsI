package com.ldh.newpig;

public class kn_BaiViet {
    int avatar;
    String name,title,content;
    int numOfLike,numOfComment,timeLastAccess;
    boolean isOld,isMark;

    public kn_BaiViet(int avatar, String name, String title, String content, int numOfLike, int numOfComment, int timeLastAccess,boolean isOld,boolean isMark) {
        this.avatar = avatar;
        this.name = name;
        this.title = title;
        this.content = content;
        this.numOfLike = numOfLike;
        this.numOfComment = numOfComment;
        this.timeLastAccess = timeLastAccess;
        this.isOld = isOld;
        this.isMark = isMark;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getNumOfLike() {
        return numOfLike;
    }

    public void setNumOfLike(int numOfLike) {
        this.numOfLike = numOfLike;
    }

    public int getNumOfComment() {
        return numOfComment;
    }

    public void setNumOfComment(int numOfComment) {
        this.numOfComment = numOfComment;
    }

    public int getTimeLastAccess() {
        return timeLastAccess;
    }

    public void setTimeLastAccess(int timeLastAccess) {
        this.timeLastAccess = timeLastAccess;
    }

    public boolean isOld() {
        return isOld;
    }

    public void setOld(boolean old) {
        isOld = old;
    }

    public boolean isMark() {
        return isMark;
    }

    public void setMark(boolean mark) {
        isMark = mark;
    }
}
