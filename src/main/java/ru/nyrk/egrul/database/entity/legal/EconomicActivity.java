package ru.nyrk.egrul.database.entity.legal;


//

import com.google.common.base.Objects;
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
public class EconomicActivity extends Entity {
    @Index(unique = true, primary = true)
    private String code;
    private String name;

    public EconomicActivity() {
    }

    public EconomicActivity(String code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        EconomicActivity that = (EconomicActivity) o;
        return Objects.equal(code, that.code) ;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(super.hashCode(), code);
    }
}
