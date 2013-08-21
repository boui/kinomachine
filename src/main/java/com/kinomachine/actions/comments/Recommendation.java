package com.kinomachine.actions.comments;

import com.github.jmkgreen.morphia.annotations.Entity;
import com.github.jmkgreen.morphia.annotations.Id;
import com.github.jmkgreen.morphia.annotations.Reference;
import com.kinomachine.actions.film.Film;
import com.kinomachine.actions.user.UserDetails;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;

/**
 * User: boui
 * Date: 5/13/13
 */
@Entity(value = "recommendation", noClassnameStored=true)
@Getter
@Setter
@EqualsAndHashCode
public class Recommendation {
    @Id
    private ObjectId id;

    private String text;
    private int rate;   //stars
    private boolean liked;
    private int likes;

    @Reference
    private UserDetails userDetails;
    @Reference
    private Film film;
}
