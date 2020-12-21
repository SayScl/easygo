package com.easygo.pojo;


import java.io.Serializable;

/**
 * @BelongsProject: easygo
 * @BelongsPackage: com.easygo.pojo
 * @Author: bruceliu
 * @QQ:1241488705
 * @CreateTime: 2020-03-30 14:45
 * @Description: 广告
 */
public class Content implements Serializable {

    private static final long serialVersionUID = -1959640528219022204L;

    private Integer id;
    private ContentCategory contentCategory; //外键字段
    private String title;
    private String url;
    private String pic;
    private String status;
    private Integer sort_order;
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

    public ContentCategory getContentCategory() {
        return contentCategory;
    }

    public void setContentCategory(ContentCategory contentCategory) {
        this.contentCategory = contentCategory;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getSort_order() {
        return sort_order;
    }

    public void setSort_order(Integer sort_order) {
        this.sort_order = sort_order;
    }

    public Integer getDel() {
        return del;
    }

    public void setDel(Integer del) {
        this.del = del;
    }

    public Content(Integer id, ContentCategory contentCategory, String title, String url, String pic, String status, Integer sort_order, Integer del) {
        this.id = id;
        this.contentCategory = contentCategory;
        this.title = title;
        this.url = url;
        this.pic = pic;
        this.status = status;
        this.sort_order = sort_order;
        this.del = del;
    }

    public Content() {
    }
}
