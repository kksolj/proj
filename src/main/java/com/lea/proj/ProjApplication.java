package com.lea.proj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动器，这里是dev
 */
@SpringBootApplication
@MapperScan("com.lea.proj.dao")
public class ProjApplication {

    public void master() {
        
    }

    public static void main(String[] args) {
        SpringApplication.run(ProjApplication.class, args);
    }
    
    public void dev() {
        System.out.println("分支1");
        System.out.println("分支2");
    }
}
