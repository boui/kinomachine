package com.kinomachine.actions.comments;

import com.github.jmkgreen.morphia.Morphia;
import com.github.jmkgreen.morphia.dao.BasicDAO;
import com.google.inject.Inject;
import com.mongodb.Mongo;
import org.bson.types.ObjectId;

import javax.inject.Named;

/**
 * User: boui
 * Date: 5/5/13
 */
public class CommentRepository extends BasicDAO<Comment, ObjectId> {
    @Inject
    public CommentRepository(Morphia morphia, Mongo mongo, @Named("db.name") String databaseName) {
        super(mongo, morphia, databaseName);
    }
}
