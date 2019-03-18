package com.chaoliu.easy.demo;

public class Fruit {

    String name;
    private Orange orange;

    public Fruit(Orange orange){
        this.orange = orange;
    }

    public Fruit(String name){
        this.name=name;
    }

    public void cutFruit(){
        Log.e("tag","Fruit切水果"+name);
    }

}
