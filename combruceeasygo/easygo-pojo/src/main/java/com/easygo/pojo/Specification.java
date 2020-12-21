package com.easygo.pojo;


import java.io.Serializable;

/**
 * @BelongsProject: easygo
 * @BelongsPackage: com.easygo.pojo
 * @Author: bruceliu
 * @QQ:1241488705
 * @CreateTime: 2020-04-01 11:28
 * @Description: TODO
 */
public class Specification implements Serializable {

    private static final long serialVersionUID = 8837759180331415520L;

    private Integer id;
    private String spec_name;
    private Integer del;

    public Specification() {
    }

    public Specification(Integer id, String spec_name, Integer del) {
        this.id = id;
        this.spec_name = spec_name;
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

    public String getSpec_name() {
        return spec_name;
    }

    public void setSpec_name(String spec_name) {
        this.spec_name = spec_name;
    }

    public Integer getDel() {
        return del;
    }

    public void setDel(Integer del) {
        this.del = del;
    }
}
