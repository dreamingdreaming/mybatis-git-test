package com.ren.li.mybatis.day04.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * 用户
 *
 * @author renl
 * @date 2018-11-22
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

    private List<Integer> ids;
}
