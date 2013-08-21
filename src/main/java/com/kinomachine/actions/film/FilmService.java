package com.kinomachine.actions.film;

import com.github.jmkgreen.morphia.Morphia;
import com.github.jmkgreen.morphia.query.Query;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.kinomachine.actions.comments.Comment;
import com.kinomachine.actions.comments.CommentRepository;
import org.bson.types.ObjectId;

import java.util.List;

/**
 * User: boui
 * Date: 5/5/13
 */
@Singleton
public class FilmService {
    private FilmRepository filmRepository;
    private CommentRepository commentRepository;

    @Inject
    FilmService(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    public List<Film> getAllFilms(){
        return filmRepository.find().asList();
    }
}
