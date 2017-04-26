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
 * Учередители компании
 */
@NodeEntity
@Getter
@Setter
@Entity
public class OwnerCompany extends EntityAbstract {
    NaturalPerson naturalPerson;
    LegalParty legalParty;
    LegalNotResident legalPartyNotResident;
    String proportion;

    @Id
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

    @ManyToOne
    public LegalNotResident getLegalPartyNotResident() {
        return legalPartyNotResident;
    }
}
