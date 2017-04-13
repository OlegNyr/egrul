package ru.nyrk.egrul.database.entity.legal;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neo4j.ogm.annotation.NodeEntity;
import ru.nyrk.egrul.database.entity.EntityAbstract;

/**
 * Учередители компании
 */
@Data
@NodeEntity
@EqualsAndHashCode(callSuper = false, exclude = "legalParty")
public class OwnerCompany extends EntityAbstract {
    NaturalPerson naturalPerson;
    LegalParty legalParty;
    LegalNotResident legalPartyNotResident;
    String proportion;
}
