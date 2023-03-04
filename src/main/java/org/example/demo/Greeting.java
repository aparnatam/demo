package org.example.demo;

public class Greeting {
    private final int id;

    public String getMsg() {
        return msg;
    }

    private final String msg,content;

    public Greeting(String msg,int id, String content) {
        this.msg = msg;
        this.id = id;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}