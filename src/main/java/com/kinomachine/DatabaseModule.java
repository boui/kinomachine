package com.kinomachine;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.kinomachine.actions.film.FilmRepository;
import com.mongodb.DB;
import com.mongodb.DBAddress;
import com.mongodb.Mongo;
import com.mongodb.MongoException;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import java.net.UnknownHostException;

/**
 * User: boui
 * Date: 5/5/13
 */
public class DatabaseModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(FilmRepository.class);
    }

    @Provides
    @Singleton
    @Inject
    public DB provideDb(@Named("db.host") String host,
                        @Named("db.port") String port,
                        @Named("db.name") String databaseName) {
        try {
            DBAddress address = new DBAddress(host,
//                    Integer.parseInt(port),
                    databaseName);
            return Mongo.connect(address);
        } catch (UnknownHostException e) {
            throw new MongoException("DB address is wrong", e);
        }
    }

    @Provides
    @Singleton
    @Inject
    public Mongo provideMongo(DB db) {
        return db.getMongo();
    }
}
