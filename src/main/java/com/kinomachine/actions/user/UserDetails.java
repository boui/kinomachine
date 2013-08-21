package com.kinomachine.actions.user;

import com.github.jmkgreen.morphia.annotations.Entity;
import com.github.jmkgreen.morphia.annotations.Id;
import com.github.jmkgreen.morphia.annotations.Reference;
import com.kinomachine.actions.film.Film;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;

import java.util.List;

/**
 * User: boui
 * Date: 5/5/13
 */
@Entity (value = "user_details", noClassnameStored=true)
@Getter
@Setter
@EqualsAndHashCode
public class UserDetails {
    @Id
    private ObjectId id;

    private List<String> socialKeys;
    private int rate;




}
