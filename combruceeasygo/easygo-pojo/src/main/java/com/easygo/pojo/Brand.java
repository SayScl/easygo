package com.easygo.pojo;

import java.io.Serializable;

/**
 * Created by 46376 on 2020/12/9.
 */
public class Brand implements Serializable{


    private static final long serialVersionUID = 2531759547209992324L;

    private Integer id;
    private String name;
    private String image;
    private String first_char;
    private Integer del;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getFirst_char() {
        return first_char;
    }

    public void setFirst_char(String first_char) {
        this.first_char = first_char;
    }

    public Integer getDel() {
        return del;
    }

    public void setDel(Integer del) {
        this.del = del;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", first_char='" + first_char + '\'' +
                ", del=" + del +
                '}';
    }
}
