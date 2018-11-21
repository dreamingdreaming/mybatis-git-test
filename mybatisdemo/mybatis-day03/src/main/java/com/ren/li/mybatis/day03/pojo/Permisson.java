package com.ren.li.mybatis.day03.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 权限表
 *
 * @author renl
 * @date 2018-11-21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Permisson {
    private int id;
    private String name;
    private int rid;
}
