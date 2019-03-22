/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: qinbo[qin_bo@suixingpay.com]
 * @date: 2019年03月13日 19时37分
 * @Copyright 2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.suixingpay.demo.service.impl;

import com.suixingpay.demo.entity.Demo;
import com.suixingpay.demo.repository.DemoRepository;
import com.suixingpay.demo.service.DemoService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoRepository demoRepository;
    @Autowired
    private Demo demo;

    @Value("${demo.test}")
    private String test;
    @Value("${demo.version}")
    private Integer version;
    @Value("${listName}")
    private List<Object> listName = new ArrayList<>();

    @Override
    public Demo test(String id) {
        log.info("从配置中读取demo中的数据");
        log.info("test={}", this.test);
        log.info("version={}", this.version);
        log.info("demo={}", this.demo);
        log.info("listName={}", this.listName);
        return this.demoRepository.selectById(id);
    }


}