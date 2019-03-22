/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: qinbo[qin_bo@suixingpay.com]
 * @date: 2019年03月13日 19时37分
 * @Copyright 2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.suixingpay.demo.repository;

import com.suixingpay.demo.entity.Demo;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Mapper
@Repository
public interface DemoRepository {
    /**
     *
     * @param id
     * @return
     */
    Demo selectById(String id);
}