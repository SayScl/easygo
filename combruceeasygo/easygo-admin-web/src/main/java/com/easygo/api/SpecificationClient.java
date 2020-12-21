package com.easygo.api;

import com.easygo.pojo.Specification;
import com.easygo.utils.PageUtils;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @BelongsProject: easygo
 * @BelongsPackage: com.easygo.api
 * @Author: bruceliu
 * @QQ:1241488705
 * @CreateTime: 2020-04-01 14:43
 * @Description: TODO
 */
@FeignClient(value = "easygo-specification-service")
public interface SpecificationClient {

    @RequestMapping(value = "/specification_update",method = RequestMethod.POST)
    public Integer specification_update(@RequestParam(name = "id") Integer id, @RequestParam(name = "spec_name") String spec_name, @RequestParam(name = "option_name") String[] option_name, @RequestParam(name = "orders") Integer[] orders) ;

        /**
         * 更新的时候数据回显
         * @param id
         * @return
         */
    @RequestMapping(value = "/specification_getById",method = RequestMethod.POST)
    public Map<String,Object> getSpecification(@RequestParam(name = "id") Integer id);

    @RequestMapping(value = "/specification_add",method = RequestMethod.POST)
    public Integer specification_add(@RequestParam(name ="spec_name") String spec_name, @RequestParam(name ="option_name") String[] option_name, @RequestParam(name ="orders") Integer[] orders);

        /**
         * 规格服务的后台
         * @param pageIndex
         * @param pageSize
         * @param spec_name
         * @return
         */
    @RequestMapping(value = "/specification_pages",method = RequestMethod.POST)
    public PageUtils<Specification> specification_pages(
            @RequestParam(defaultValue = "1", required = false,name = "pageIndex") Integer pageIndex,
            @RequestParam(defaultValue = "5", required = false,name = "pageSize") Integer pageSize, @RequestParam(defaultValue = "", required = false,name = "spec_name") String spec_name);

}
