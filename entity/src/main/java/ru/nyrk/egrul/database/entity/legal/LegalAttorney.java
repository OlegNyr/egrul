package ru.nyrk.egrul.database.entity.legal;

import lombok.Getter;
import lombok.Setter;
import org.neo4j.ogm.annotation.NodeEntity;
import ru.nyrk.egrul.database.entity.EntityAbstract;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Доверенность
 */
@NodeEntity
@Entity
@Getter
@Setter
public class LegalAttorney extends EntityAbstract {


    private NaturalPerson naturalPerson;
    private String dolgnostCode;
    private String dolgnostCodeName;
    private String dolgnostName;
    private LegalParty legalParty;

    @Id
    @Override
    public Long getId() {
        return id;
    }

    @ManyToOne
    public NaturalPerson getNaturalPerson() {
        return naturalPerson;
    }

    @ManyToOne
    public LegalParty getLegalParty() {
        return legalParty;
    }
}
