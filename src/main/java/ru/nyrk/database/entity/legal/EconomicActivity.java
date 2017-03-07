package ru.nyrk.database.entity.legal;


//

import lombok.Data;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.NodeEntity;
import ru.nyrk.database.entity.Entity;

/**
 * Общероссийский классификатор видов экономической Деятельности
 */
@Data
@NodeEntity
public class EconomicActivity extends Entity {
    @Index(unique = true)
    String code;
    String name;

    public EconomicActivity() {
    }

    public EconomicActivity(String code, String name) {
        this.code = code;
        this.name = name;
    }
}
