package com.kinomachine.actions.user;

import com.github.jmkgreen.morphia.annotations.Entity;
import com.github.jmkgreen.morphia.annotations.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;

/**
 * User: boui
 * Date: 5/13/13
 */
@Entity(value = "achievement", noClassnameStored = true)
@Getter
@Setter
@EqualsAndHashCode
public class Achievement {
    @Id
    ObjectId id;

    String name;
    String description;
    String pictureUrl;
    String rarity;
}
