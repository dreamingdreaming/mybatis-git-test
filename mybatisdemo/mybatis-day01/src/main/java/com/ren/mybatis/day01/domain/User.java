package com.ren.mybatis.day01.domain;

/**
 * 用户
 *
 * @author renl
 * @date 2018-11-19
 */
public class User {
    private Long id;
    private String u_name;
    private String password;
    private Integer age;

    public User() {
    }

    public User(Long id, String u_name, String password, Integer age) {
        this.id = id;
        this.u_name = u_name;
        this.password = password;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
