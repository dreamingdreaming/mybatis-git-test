package com.ren.li.mybatis.day03.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 用户表
 * @author renl
 * @date 2018-11-21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    private Long id;
    private String u_name;
    private String password;
    private int age;
    private Role role;
}
