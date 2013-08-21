package com.kinomachine.actions.comments;

import com.github.jmkgreen.morphia.annotations.Entity;
import com.github.jmkgreen.morphia.annotations.Id;
import com.github.jmkgreen.morphia.annotations.Reference;
import com.kinomachine.actions.user.Achievement;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;

import java.util.List;

/**
 * User: boui
 * Date: 5/14/13
 */
@Entity(value = "contest", noClassnameStored=true)
@Getter
@Setter
@EqualsAndHashCode
public class Contest {
    @Id
    ObjectId id;

    @Reference(concreteClass = Comment.class)
    List<Comment> commentList;
    @Reference
    Achievement price;
}
