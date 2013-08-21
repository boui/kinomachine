package com.kinomachine.actions.search;

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
@Entity(value = "requirement", noClassnameStored = true)
@Getter
@Setter
@EqualsAndHashCode
public class Requirement {
    @Id
    private ObjectId id;
    private RequirementType type;
    private String value;
}
