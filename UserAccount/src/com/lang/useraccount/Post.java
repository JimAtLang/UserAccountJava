package com.lang.useraccount;

public class Post {
    private int shares;
    private int likes;
    private User author;
    private String title;
    private String text;
    public Post(int shares, int likes, User author, String title, String text) {
        this.shares = shares;
        this.likes = likes;
        this.author = author;
        this.title = title;
        this.text = text;
    }
    public int getShares() {
        return shares;
    }
    public void setShares(int shares) {
        this.shares = shares;
    }
    public int getLikes() {
        return likes;
    }
    public void setLikes(int likes) {
        this.likes = likes;
    }
    public User getAuthor() {
        return author;
    }
    public void setAuthor(User author) {
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
}
