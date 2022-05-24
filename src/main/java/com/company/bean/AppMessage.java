package com.company.bean;

import java.util.Date;

public class AppMessage {
    private String id;
    private String message;
    private Date sendDate;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }
    public Date getSendDate() {
        return sendDate;
    }
    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }
}
