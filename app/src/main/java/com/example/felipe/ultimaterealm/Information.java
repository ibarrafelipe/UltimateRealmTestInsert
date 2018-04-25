package com.example.felipe.ultimaterealm;

import io.realm.RealmObject;

public class Information extends RealmObject {


    String name;
    String age;


    @Override
    public String toString() {
        return "Information{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }



}
