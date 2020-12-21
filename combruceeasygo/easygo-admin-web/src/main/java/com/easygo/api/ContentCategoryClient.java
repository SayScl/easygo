package com.easygo.api;

import com.easygo.pojo.ContentCategory;
import com.easygo.utils.PageUtils;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

/**
 * @BelongsProject: easygo
 * @BelongsPackage: com.easygo.api
 * @Author: bruceliu
 * @QQ:1241488705
 * @CreateTime: 2020-03-30 10:51
 * @Description: TODO
 */
@FeignClient(value = "easygo-ad-service")
@Service
public interface ContentCategoryClient {

    /**
     * 查询有效的广告分类
     * @return
     */
    @RequestMapping(value = "/contentCategory_list",method = RequestMethod.POST)
    public List<ContentCategory> getContentCategorys();

    @RequestMapping(value = "/contentCategory_delete",method = RequestMethod.POST)
    public int deleteContentCategory(@RequestParam(name = "id") Integer id);

    @RequestMapping(value = "/contentCategory_update",method = RequestMethod.POST)
    public int updateContentCategory(@RequestBody ContentCategory contentCategory);

    @RequestMapping(value = "/contentCategory_getById",method = RequestMethod.POST)
    public ContentCategory getById(@RequestParam(name = "id") Integer id);

    @RequestMapping(value = "/contentCategory_add",method = RequestMethod.POST)
    public int addContentCategory(@RequestBody ContentCategory contentCategory);

    @RequestMapping(value = "/contentCategory_page",method = RequestMethod.POST)
    public PageUtils<ContentCategory> getcontentCategorys(@RequestParam(defaultValue = "1", required = false,name = "pageIndex") Integer pageIndex, @RequestParam(defaultValue = "5", required = false,name = "pageSize") Integer pageSize,
                                                          @RequestParam(defaultValue = "", required = false,name = "name") String name);
}
