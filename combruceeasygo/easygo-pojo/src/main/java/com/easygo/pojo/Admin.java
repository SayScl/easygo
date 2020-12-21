package com.easygo.pojo;

import java.io.Serializable;

public class Admin implements Serializable {

    private static final long serialVersionUID = -4661478899811906793L;

    private Integer id;
    private String username;
    private String password;
    private String status;
    private String photo;
    private Integer del;

    public Admin() {
    }

    public Admin(Integer id, String username, String password, String status, String photo, Integer del) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.status = status;
        this.photo = photo;
        this.del = del;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Integer getDel() {
        return del;
    }

    public void setDel(Integer del) {
        this.del = del;
    }
}
