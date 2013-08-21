package com.kinomachine;

import com.google.inject.AbstractModule;

public class MainGuiceModule extends AbstractModule {
    @Override
    protected void configure() {
        install(new PropertiesModule());
        install(new DatabaseModule());
    }
}
