package com.kinomachine.actions.film;

import com.google.guiceberry.GuiceBerryModule;
import com.google.guiceberry.junit4.GuiceBerryRule;
import com.google.inject.Inject;
import com.kinomachine.DatabaseModule;
import com.kinomachine.PropertiesModule;
import com.kinomachine.actions.comments.Comment;
import com.kinomachine.actions.comments.CommentRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

/**
 * User: boui
 * Date: 5/5/13
 */
public class FilmServiceIntegrationTest {
    @Inject
    FilmRepository repository;
    @Inject
    CommentRepository crepository;

    Comment comment = new Comment();
    Film film = new Film();

    @Before
    public void setUp() {
//        film.setName("Kickass");
        film.setAllTimesRate(100);
        repository.save(film);

        comment.setText("WOW");
        comment.setFilm(film);
        crepository.save(comment);
    }

    @After
    public void tearDown() {
                                         crepository.delete(comment);
        repository.delete(film);

    }

    @Rule
    public final GuiceBerryRule guiceBerry = new GuiceBerryRule(Env.class);

    public static final class Env extends GuiceBerryModule {
        @Override
        protected void configure() {
            super.configure();
            install(new PropertiesModule());
            install(new DatabaseModule());
        }
    }

    @Inject
    FilmService filmService;

    @Test
    public void testGetAllFilms() throws Exception {

    }
}
