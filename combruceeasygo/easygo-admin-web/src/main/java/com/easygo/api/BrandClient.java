package com.easygo.api;

import com.easygo.pojo.Brand;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @BelongsProject: easygo
 * @BelongsPackage: com.easygo.api
 * @Author: bruceliu
 * @QQ:1241488705
 * @CreateTime: 2020-03-27 11:26
 * @Description: TODO
 */
@FeignClient(value = "easygo-brand-service")
@Service
public interface BrandClient {

    @RequestMapping("/brand_getBrands")
    public List<Brand> getBrands();

    @RequestMapping(value = "/brand_add",method = RequestMethod.GET)
    public int addBrand(@RequestBody Brand brand);

    @RequestMapping(value = "/brand_getBrandById",method = RequestMethod.GET)
    public Brand getBrandById(@RequestParam(name = "id") Integer id);

    @RequestMapping(value = "/brand_updateBrand",method = RequestMethod.POST)
    public int updateBrand(@RequestBody Brand brand);

    @RequestMapping(value = "/brand_delete",method = RequestMethod.GET)
    public int deleteBrand(@RequestParam(name = "id") Integer id);

    @RequestMapping(value = "/brand_deleteSome",method = RequestMethod.GET)
    public int deleteSome(@RequestParam(name = "ids") String ids);
}
