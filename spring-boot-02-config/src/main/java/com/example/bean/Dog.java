package com.example.bean;

/**
 * Created with IntelliJ IDEA.
 *
 * @User: @Created by yangtk
 * @Date: @Date 2019/12/16 20:09
 * @To change this template use File | Settings | File Templates.
 */
public class Dog {
    private String name;
    private String age;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public Dog setName(String name) {
        this.name = name;
        return this;
    }

    public String getAge() {
        return age;
    }

    public Dog setAge(String age) {
        this.age = age;
        return this;
    }
}
