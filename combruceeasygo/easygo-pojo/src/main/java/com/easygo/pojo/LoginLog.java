package com.easygo.pojo;

import java.io.Serializable;

public class LoginLog implements Serializable {

    private static final long serialVersionUID = 7532396427016551234L;

    private Integer id;
    private String ip;
    private String no;//登录账号
    private String createtime;
    private String location;

    public LoginLog(Integer id, String ip, String no, String createtime, String location) {
        this.id = id;
        this.ip = ip;
        this.no = no;
        this.createtime = createtime;
        this.location = location;
    }

    public LoginLog() {
    }

    public LoginLog(String ip, String no, String location) {
        this.ip = ip;
        this.no = no;
        this.location = location;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
