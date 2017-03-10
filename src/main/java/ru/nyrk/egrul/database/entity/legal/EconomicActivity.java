package ru.nyrk.egrul.database.entity.legal;


//

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.NodeEntity;
import ru.nyrk.egrul.database.entity.Entity;

/**
 * Общероссийский классификатор видов экономической Деятельности
 */
@Data
@NodeEntity
@EqualsAndHashCode(callSuper = false)
public class EconomicActivity extends Entity {
    @Index(unique = true, primary = true)
    String code;
    String name;

    public EconomicActivity() {
    }

    public EconomicActivity(String code, String name) {
        this.code = code;
        this.name = name;
    }
}
