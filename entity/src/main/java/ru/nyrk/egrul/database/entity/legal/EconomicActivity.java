package ru.nyrk.egrul.database.entity.legal;


//

import com.google.common.base.Objects;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.NodeEntity;
import ru.nyrk.egrul.database.entity.EntityAbstract;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Общероссийский классификатор видов экономической Деятельности
 */
@Getter
@Setter
@NodeEntity
@Entity
public class EconomicActivity extends EntityAbstract {
    @Index(unique = true, primary = true)
    private String code;
    private String name;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public EconomicActivity() {
    }

    public EconomicActivity(String code, String name) {
        this.code = code;
        this.name = name;
    }
}
