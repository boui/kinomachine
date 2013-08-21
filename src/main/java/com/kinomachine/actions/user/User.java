package com.kinomachine.actions.user;

import com.github.jmkgreen.morphia.annotations.Entity;
import com.github.jmkgreen.morphia.annotations.Id;
import com.github.jmkgreen.morphia.annotations.Reference;
import com.kinomachine.actions.search.Requirement;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;

import java.util.List;
import java.util.Map;

/**
 * User: boui
 * Date: 5/13/13
 */
@Entity(value = "kino_user", noClassnameStored=true)
@Getter
@Setter
@EqualsAndHashCode
public class User {
    @Id
    ObjectId id;

    @Reference private UserDetails userDetails;

    @Reference(concreteClass = Achievement.class)
    private List<Achievement> achievements;

    @Reference(concreteClass = Requirement.class)
    private Map<String, List<Requirement>> savedFilters;

}
