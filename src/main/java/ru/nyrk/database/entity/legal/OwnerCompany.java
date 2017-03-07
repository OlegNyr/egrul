package ru.nyrk.database.entity.legal;

import lombok.Data;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * Учередители компании
 */
@Data
@NodeEntity
public class OwnerCompany {
    NaturalPerson naturalPerson;
    LegalParty legalParty;
    LegalNotResident legalPartyNotResident;
    String proportion;
}
