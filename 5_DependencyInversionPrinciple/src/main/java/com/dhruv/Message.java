package com.dhruv;

import java.time.LocalDateTime;

public class Message {

    private String msg;

    private LocalDateTime timestamp;

    public Message(String msg) {
        this.msg = msg;
    }

    public Message(String msg, LocalDateTime timestamp) {
        this.msg = msg;
        this.timestamp = timestamp;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
