package com.kinomachine.actions.comments;

import com.github.jmkgreen.morphia.annotations.Entity;
import com.github.jmkgreen.morphia.annotations.Id;
import com.github.jmkgreen.morphia.annotations.Reference;
import com.kinomachine.actions.film.Film;
import com.kinomachine.actions.user.User;
import com.kinomachine.actions.user.UserDetails;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;

/**
 * User: boui
 * Date: 5/5/13
 */
@Entity(value = "comment", noClassnameStored=true)
@Getter
@Setter
@EqualsAndHashCode
public class Comment {
    @Id
    private ObjectId id;

    private String text;
    private int rate;
    private boolean liked;
    private int likes;

    @Reference
    private User userDetails;

    @Reference
    private Film film;
}
