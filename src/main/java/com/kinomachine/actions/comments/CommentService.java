package com.kinomachine.actions.comments;

import com.google.inject.Inject;
import com.kinomachine.actions.film.Film;

import javax.inject.Singleton;
import java.util.List;

/**
 * User: boui
 * Date: 5/5/13
 */
@Singleton
public class CommentService {
    private CommentRepository commentRepository;

    @Inject
    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }
}
