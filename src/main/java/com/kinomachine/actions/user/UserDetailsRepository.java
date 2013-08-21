package com.kinomachine.actions.user;

import com.github.jmkgreen.morphia.Morphia;
import com.github.jmkgreen.morphia.dao.BasicDAO;
import com.google.inject.Inject;
import com.mongodb.Mongo;
import org.bson.types.ObjectId;

import javax.inject.Named;
import javax.inject.Singleton;

/**
 * User: boui
 * Date: 5/5/13
 */
@Singleton
public class UserDetailsRepository extends BasicDAO<UserDetails, ObjectId> {
    @Inject
    public UserDetailsRepository(Morphia morphia, Mongo mongo, @Named("db.name") String databaseName) {
        super(mongo, morphia, databaseName);
    }
}