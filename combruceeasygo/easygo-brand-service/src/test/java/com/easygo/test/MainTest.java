package com.easygo.test;

import com.easygo.mapper.BrandMapper;
import com.easygo.pojo.Brand;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 46376 on 2020/12/9.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class MainTest {

    @Resource
    private BrandMapper brandMapper;


    @Test
    public void brandTest(){
        List<Brand> brands = brandMapper.getBrands();
        for(Brand brand:brands){
            System.out.println(brand);
        }
    }
}
