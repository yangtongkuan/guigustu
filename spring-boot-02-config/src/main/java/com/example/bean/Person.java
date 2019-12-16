package com.example.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @User: @Created by yangtk
 * @Date: @Date 2019/12/16 20:07
 * @To change this template use File | Settings | File Templates.
 * @desc : 将配置文件中的每个属性值映射到这个组件中
 * @ConfigurationProperties 告诉springboot 将本类中所有的属性和配置文件中相关配置进行关联
 *  必须是springboot容器中的组件才能使用 ConfigurationProperties 这个注解
 */
@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    private String lastName;
    private Integer age;
    private Boolean boss;
    private Date birth;
    private Dog dog;
    private Map<String,Object> maps;
    private List<Object> lists;

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                ", dog=" + dog +
                ", maps=" + maps +
                ", lists=" + lists +
                '}';
    }

    public String getLastName() {
        return lastName;
    }

    public Person setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public Person setAge(Integer age) {
        this.age = age;
        return this;
    }

    public Boolean getBoss() {
        return boss;
    }

    public Person setBoss(Boolean boss) {
        this.boss = boss;
        return this;
    }

    public Date getBirth() {
        return birth;
    }

    public Person setBirth(Date birth) {
        this.birth = birth;
        return this;
    }

    public Dog getDog() {
        return dog;
    }

    public Person setDog(Dog dog) {
        this.dog = dog;
        return this;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public Person setMaps(Map<String, Object> maps) {
        this.maps = maps;
        return this;
    }

    public List<Object> getLists() {
        return lists;
    }

    public Person setLists(List<Object> lists) {
        this.lists = lists;
        return this;
    }
}
