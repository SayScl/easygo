package com.easygo.mapper;

import com.easygo.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @BelongsProject: easygo
 * @BelongsPackage: com.easygo.mapper
 * @Author: bruceliu
 * @QQ:1241488705
 * @CreateTime: 2020-03-28 11:29
 * @Description: TODO
 */
@Mapper
@Component
public interface AdminMapper {

    public Admin adminlogin(Admin admin);
}
