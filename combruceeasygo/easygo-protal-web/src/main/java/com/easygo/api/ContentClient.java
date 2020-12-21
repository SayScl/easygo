package com.easygo.api;

import com.easygo.pojo.Content;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @BelongsProject: easygo
 * @BelongsPackage: com.easygo.api
 * @Author: bruceliu
 * @QQ:1241488705
 * @CreateTime: 2020-03-30 16:12
 * @Description: TODO
 */
@FeignClient(value = "easygo-ad-service")
@Service
public interface ContentClient {

    @RequestMapping(value = "/content_getContentsByCategoryId",method = RequestMethod.POST)
    public List<Content> getContentsByCategoryId(@RequestParam(name = "categoryId") Integer categoryId);
}
