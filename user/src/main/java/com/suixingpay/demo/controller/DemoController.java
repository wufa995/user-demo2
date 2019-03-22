/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: qinbo[qin_bo@suixingpay.com]
 * @date: 2019年03月13日 14时37分
 * @Copyright 2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.suixingpay.demo.controller;

import com.suixingpay.demo.entity.Demo;
import com.suixingpay.demo.service.DemoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.Callable;


/**
 * 注解描述
 * ↓@Api 标注在controller上
 * ↓@RestController 等同于 @ResponseBody + @Controller
 * **/
@Api(description = "样例接口")
//@RestController
@Controller
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @PutMapping("/demo")
    @ApiOperation(value = "这里输入接口名称", notes = "# 这里支持MarkerDown语法")
    public void demo(){
    }

    /**
     * demo01 GET方式例子
     * @param str 路径中传入参数
     * @param demo 参入对象
     * @return
     */
    @GetMapping("/demo/{str}")
    @ApiOperation(value = "这里输入接口名称", notes = "# 这里支持MarkerDown语法")
    public Callable<String> demo01(@PathVariable("str") String str, Demo demo){
        // 这里是Lambda表达式的写法
        // 写法1 return () -> "hello";
        return () -> {
            if(str == null || "".equals(str.trim())) {
                return "hello";
            }
            return str;
        };
    }

    /**
     * GET请求接收对象
     * @param demo
     * @return json格式字符串
     */
    @GetMapping("/demo")
    @ApiOperation(value = "这里输入接口名称", notes = "# 这里支持MarkerDown语法")
    public Demo demo02(Demo demo){
        return demo;
    }

    /**
     * GET请求接收对象
     * @param demo 传入格式为json字符串
     * @return json格式字符串
     */
    @PostMapping("/demo")
    @ApiOperation(value = "这里输入接口名称", notes = "# 这里支持MarkerDown语法")
    public Demo demo03(@RequestBody Demo demo){
        return demo;
    }

    /**
     * GET请求接收对象
     * @param id
     * @return json格式字符串
     */
    @GetMapping("/db")
    @ApiOperation(value = "这里输入接口名称", notes = "# 这里支持MarkerDown语法")
    public Demo demo04(String id){
        return demoService.test(id);
    }

    /**
     * GET请求接收对象
     * @param id
     * @return json格式字符串
     */
    @GetMapping("/db2")
    @ApiOperation(value = "这里输入接口名称", notes = "# 这里支持MarkerDown语法")
    public String demo05(Model model,String id){
        Demo demo = demoService.test(id);
        model.addAttribute("demo", demo);
        return "index";
    }
}