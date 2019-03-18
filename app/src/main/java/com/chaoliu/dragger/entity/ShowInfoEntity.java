package com.chaoliu.dragger.entity;

public class ShowInfoEntity {
    private String name;

    public ShowInfoEntity(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "ShowInfoEntity{" +
                "name='" + name + '\'' +
                '}';
    }
}
