package com.easygo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by 46376 on 2020/12/9.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class AdminWebApplication {

    public static void main(String[] args){
        SpringApplication.run(AdminWebApplication.class,args);
    }
}
