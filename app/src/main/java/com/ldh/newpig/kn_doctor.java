package com.ldh.newpig;

public class kn_doctor {
    String name;
    int like;
    int avatar;
    int coverImage;

    public kn_doctor(String name, int like, int avatar, int coverImage) {
        this.name = name;
        this.like = like;
        this.avatar = avatar;
        this.coverImage = coverImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public int getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(int coverImage) {
        this.coverImage = coverImage;
    }
}
