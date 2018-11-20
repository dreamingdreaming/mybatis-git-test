package com.ren.li.mybatis.day02.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户实体
 *
 * @author renl
 * @date 2018-11-20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Long id;
    private String u_name;
    private String password;
    private int age;


}
