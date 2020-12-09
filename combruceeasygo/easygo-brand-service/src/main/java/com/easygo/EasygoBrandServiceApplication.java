package com.easygo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by 46376 on 2020/12/9.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class EasygoBrandServiceApplication {

    public static void main(String[] args){
        SpringApplication.run(EasygoBrandServiceApplication.class,args);
    }
}
