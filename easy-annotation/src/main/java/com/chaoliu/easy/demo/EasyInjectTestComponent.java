package com.chaoliu.easy.demo;

import com.chaoliu.easy.api.Component;

public class EasyInjectTestComponent implements Component {

    private Test target;

    private Knife knife;

    private Orange orange;

    private Fruit fruit;

    private EasyInjectTestComponent(){
    }

    private EasyInjectTestComponent(Builder builder) {}

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public void inject(Object target) {
        this.target = (Test) target;
        //通过new的方式 一层一层
        this.target.demoxxx = new Demo(  );
        this.target.demoName = new Demo( "" );

        //static
        this.target.nameTest = Demo.getInstance();

        //单例方法
        this.target.singleton = TestSingleton.getInstance();

        //dagger如何知道他们之间关联性的
        this.knife = new Knife();
        this.orange = new Orange( knife );
        this.fruit = new Fruit( orange );



    }

    public static final class Builder {
        private Builder() {}
        public EasyInjectTestComponent build() {
            return new EasyInjectTestComponent(this);
        }
    }

}