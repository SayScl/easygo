package com.easygo.api;

import com.easygo.pojo.Content;
import com.easygo.utils.PageUtils;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @BelongsProject: easygo
 * @BelongsPackage: com.easygo.api
 * @Author: bruceliu
 * @QQ:1241488705
 * @CreateTime: 2020-03-30 15:02
 * @Description: TODO
 */
@FeignClient(value = "easygo-ad-service")
@Service
public interface ContentClient {


    @RequestMapping(value = "/content_updateStatus",method = RequestMethod.POST)
    public Integer updateStatus(@RequestParam(name = "id") Integer id,@RequestParam(name = "status") Integer status);

    @RequestMapping(value = "/content_add",method = RequestMethod.POST)
    public Integer addContent(@RequestBody Content content);

    @RequestMapping(value = "/content_page",method = RequestMethod.POST)
    public PageUtils<Content> getContent_page(@RequestParam(defaultValue = "1", required = false,name = "pageIndex") Integer pageIndex,
                                              @RequestParam(defaultValue = "5", required = false,name = "pageSize") Integer pageSize);

}
