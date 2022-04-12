package com.cjbdi;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description 描述
 * @date   2022-04-11 下午6:10
 * @author  wuyanshen
 */

@EnableDubbo
@SpringBootApplication
public class BServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(BServiceApp.class, args);
    }

}
