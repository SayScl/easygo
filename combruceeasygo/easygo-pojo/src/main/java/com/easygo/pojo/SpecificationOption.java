package com.easygo.pojo;


import java.io.Serializable;
import java.time.Period;

/**
 * @BelongsProject: easygo
 * @BelongsPackage: com.easygo.pojo
 * @Author: bruceliu
 * @QQ:1241488705
 * @CreateTime: 2020-04-01 11:30
 * @Description: TODO
 */
public class SpecificationOption implements Serializable {

    private static final long serialVersionUID = 4522866958820850948L;

    private Integer id;
    private String option_name;

    private Specification specification; //外键对象

    //private Integer spec_id;
    private Integer orders;
    private Integer del;

    public SpecificationOption(Integer id, String option_name, Specification specification, Integer orders, Integer del) {
        this.id = id;
        this.option_name = option_name;
        this.specification = specification;
        this.orders = orders;
        this.del = del;
    }

    public SpecificationOption() {
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

    public String getOption_name() {
        return option_name;
    }

    public void setOption_name(String option_name) {
        this.option_name = option_name;
    }

    public Specification getSpecification() {
        return specification;
    }

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public Integer getOrders() {
        return orders;
    }

    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    public Integer getDel() {
        return del;
    }

    public void setDel(Integer del) {
        this.del = del;
    }
}
