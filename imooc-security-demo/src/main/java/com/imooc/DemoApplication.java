package com.imooc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Author: DongXin
 * @Description:测试类
 * @Date:
 */
@SpringBootApplication
@RestController
public class DemoApplication {

    /**
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        System.out.println("hello 世界");
        System.out.println("hello 您好");
        return "hello spring security";
    }
}
