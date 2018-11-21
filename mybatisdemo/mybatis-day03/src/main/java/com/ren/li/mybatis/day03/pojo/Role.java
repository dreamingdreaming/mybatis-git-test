package com.ren.li.mybatis.day03.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * 角色表
 *
 * @author renl
 * @date 2018-11-21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Role {
    private int rid ;
    private String r_name;
    private List<Permisson> permissonList;
}
