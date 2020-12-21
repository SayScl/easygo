package com.easygo.api;

import com.easygo.pojo.LoginLog;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
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
 * @CreateTime: 2020-03-28 16:06
 * @Description: TODO
 */
@FeignClient(value = "easygo-admin-service")
@Component
public interface LoginLogClient {

    /**
     * 新增日志
     * @param log
     * @return
     */
    @RequestMapping(value = "/loginLog_add",method = RequestMethod.POST)
    public int addLoginLog(@RequestBody LoginLog log);

    /**
     * 查询我的登录日志
     * @param username
     * @return
     */
    @RequestMapping(value = "/loginLog_logs",method = RequestMethod.POST)
    public List<LoginLog> getMyLoginLogs(@RequestParam(name = "username") String username);


}
