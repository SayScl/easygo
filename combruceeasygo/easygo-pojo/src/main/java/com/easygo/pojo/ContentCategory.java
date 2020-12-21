package com.easygo.pojo;


import java.io.Serializable;

/**
 * @BelongsProject: easygo
 * @BelongsPackage: com.easygo.pojo
 * @Author: bruceliu
 * @QQ:1241488705
 * @CreateTime: 2020-03-30 09:53
 * @Description: TODO
 */
public class ContentCategory implements Serializable {

    private static final long serialVersionUID = 5266300161133421639L;

    private Integer id;
    private String name;
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

    public Integer getDel() {
        return del;
    }

    public void setDel(Integer del) {
        this.del = del;
    }

    public ContentCategory(Integer id, String name, Integer del) {
        this.id = id;
        this.name = name;
        this.del = del;
    }

    public ContentCategory() {
    }
}
