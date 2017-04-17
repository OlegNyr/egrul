package ru.nyrk.egrul.database.entity;

import lombok.Getter;
import lombok.Setter;
import org.neo4j.ogm.annotation.GraphId;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Getter
@Setter
@Embeddable
public abstract class EntityAbstract {

    @GraphId
    protected Long id;
    @Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EntityAbstract)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
