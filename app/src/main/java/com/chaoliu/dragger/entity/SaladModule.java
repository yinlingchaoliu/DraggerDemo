package com.chaoliu.dragger.entity;

import dagger.Module;
import dagger.Provides;

@Module
public class SaladModule {

    @Provides
    public Orange provideOrange(Knife knife) {
        return new Orange( knife );
    }

    @Provides
    public Fruit provideFruit(Orange orange) {
        return new Fruit( orange );
    }

    @Provides
    public ShowInfoEntity provideInfo(String name) {
        return new ShowInfoEntity( name );
    }

    @Provides
    public Knife provideKnife() {
        return new Knife();
    }

    @Provides
    public String getTags() {
        return "orange";
    }
}