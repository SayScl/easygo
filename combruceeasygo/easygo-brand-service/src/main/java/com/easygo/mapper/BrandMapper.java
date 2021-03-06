package com.easygo.mapper;

import com.easygo.pojo.Brand;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by 46376 on 2020/12/9.
 */
@Mapper
public interface BrandMapper {

    public List<Brand> getBrands();

    public int addBrand(Brand brand);

    public int updateBrand(Brand brand);

    public Brand getBrandById(Integer id);

    public int deleteBrand(Integer id);

    public int deleteSome(@Param("ids") String ids);

    public int deleteSome1(Integer[] ids);

    //查询总条数(没有条件)
    public int getTotalCount();

    //查询每页的数据(没有条件)
    public List<Brand> getPageBrands(Map<String,Object> map);

}
