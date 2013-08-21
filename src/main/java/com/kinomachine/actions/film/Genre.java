package com.kinomachine.actions.film;

import com.github.jmkgreen.morphia.annotations.Entity;
import com.github.jmkgreen.morphia.annotations.Id;
import com.github.jmkgreen.morphia.annotations.Reference;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;

import java.util.List;

/**
 * User: boui
 * Date: 5/5/13
 */
@Entity(value = "genre", noClassnameStored = true)
@Getter
@Setter
@EqualsAndHashCode
public class Genre {
    @Id
    private ObjectId id;
    private String name;

    @Reference
    private List<Film> film;
}
