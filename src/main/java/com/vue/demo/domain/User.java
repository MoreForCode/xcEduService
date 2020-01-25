package com.vue.demo.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * 实体类
 */
@Data
public class User implements Serializable {
    //主键id
    private Integer id;
    // 年龄
    private Integer age;
    // 姓名
    private String userName;
    // 密码
    private String passWord;
    // 邮箱
    private String email;
    // 性别
    private String sex;
}
