package com.kinomachine;

import com.google.inject.AbstractModule;
import com.kinomachine.actions.film.FilmService;

/**
 * User: boui
 * Date: 5/5/13
 */
public class ServiceModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(FilmService.class);
    }
}
