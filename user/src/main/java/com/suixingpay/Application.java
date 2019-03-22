/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: qinbo[qin_bo@suixingpay.com]
 * @date: 2019年03月13日 14时27分
 * @Copyright 2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.suixingpay;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/** 来标注一个主程序类，说明这是一个Spring Boot应用 **/
@EnableSwagger2
@SpringBootApplication
@MapperScan("com.suixingpay.demo.repository")
public class Application {
    public static void main(String[] args) {
        // 启动SpringBoot应用
        SpringApplication.run(Application.class,args);
    }
}
