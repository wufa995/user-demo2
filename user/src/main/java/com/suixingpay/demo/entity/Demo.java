package com.suixingpay.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Data ： 生成getter、setter、equals、hashcode、toString方法
 * NoArgsConstructor ：生成无参构造方法
 * AllArgsConstructor ： 生成全参数构造方法
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@ConfigurationProperties(prefix = "demo")
public class Demo {

  /** 主键 **/
  private String id;
  /** 用户名 **/
  private String userName;
  /** 密码 **/
  private String password;
  /** 角色/身份 **/
  private String role;
  /** 删除【0：未删除、1：已删除】**/
  private long isDelete;
}
