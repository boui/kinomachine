package com.kinomachine.actions.film;

import com.github.jmkgreen.morphia.annotations.Entity;
import com.github.jmkgreen.morphia.annotations.Id;
import com.github.jmkgreen.morphia.annotations.Reference;
import com.kinomachine.actions.comments.Comment;
import com.kinomachine.actions.user.User;
import com.kinomachine.actions.user.UserDetails;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;

import javax.print.DocFlavor;
import java.util.List;

/**
 * User: boui
 * Date: 5/5/13
 */
@Entity(value = "film", noClassnameStored=true)
@Getter
@Setter
@EqualsAndHashCode
public class Film {
    @Id private ObjectId id;

    private List<String> name;//different languages
    private String description;
    private int productionYear;
    private int code;
    private boolean hasDirectorsCut;
    private int allTimesRate;
    private List<String> tag;
    private List<String> actors;
    private List<Quality> availableQuality;
    private List<String> urls;
    private FilmType type;

    @Reference(concreteClass = User.class)
    private List<User> usersSeenAFilm;
}
