package com.easygo.controller;

import com.easygo.api.BrandClient;
import com.easygo.pojo.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @BelongsProject: easygo
 * @BelongsPackage: com.easygo.controller
 * @Author: bruceliu
 * @QQ:1241488705
 * @CreateTime: 2020-03-27 11:24
 * @Description: TODO
 */
@Controller
@Scope("prototype")
public class BrandController {

    @Autowired
    BrandClient brandClient;

    @RequestMapping("/brand_getBrands")
    public String getBrands(ModelMap map) {
        List<Brand> brands = brandClient.getBrands();
        map.put("brands", brands);
        return "brand";
    }
}